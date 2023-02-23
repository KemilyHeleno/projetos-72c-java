import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Date;
import java.util.GregorianCalendar;
 
 class JTestadata extends JFrame implements ActionListener
{ // Objeto Janela
	private ImageIcon ft;
	private JLabel img;
	private JLabel txdia,txmes,txano,txdata;
	private JComboBox cxdia,cxmes,cxano;
	private JButton bt1,bt2;
	private String vdia,vmes,vano,junta;
	private SimpleDateFormat sdf;
	private Date xdata;
	private GregorianCalendar gc;
	private Font tipofonte;
	private String semana[]={"Nada","Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sabado"};
		
	
   public void actionPerformed(ActionEvent ae)
   {
	   if(ae.getSource()==bt1)
	   {
		    try
			{
				if(cxdia.getSelectedIndex()== -1)
				{
					cxdia.grabFocus();
					return;
				}
				if(cxmes.getSelectedIndex()== -1)
				{
					cxmes.grabFocus();
					return;
				}
				
				if(cxano.getSelectedIndex()== -1)
				{
					cxano.grabFocus();
					return;
				}
				vdia=""+cxdia.getSelectedItem();
				vmes=""+cxmes.getSelectedItem();
				vano=""+cxano.getSelectedItem();
				junta=vdia+"/"+vmes+"/"+vano;
				
				sdf=new SimpleDateFormat("dd/MM/yyyy");
                sdf.setLenient(false);
                xdata=sdf.parse(junta);
                gc=new GregorianCalendar();
                gc.setTime(xdata);
                int dS=gc.get(GregorianCalendar.DAY_OF_WEEK);
                txdata.setText(junta+=" "+semana[dS]);
		}catch(Exception erro)
			{
				txdata.setText(junta+"->Data Invalida!!!");
			}
	   }
	   if(ae.getSource()==bt2)
	    {
			cxdia.setSelectedIndex(-1);
			cxmes.setSelectedIndex(-1);
			cxano.setSelectedIndex(-1);
			txdata.setText("Data???");
		}
		      
   }
   public  JTestadata()
   {
	  super("72C Kemily - 10");
      setSize(850,600);//larg,altu
      setLocationRelativeTo(null);//x,y
      setResizable(false);
      getContentPane().setBackground(Color.white);
      
      ft=new ImageIcon("calendario.jpg");
      img=new JLabel(ft);
      
      txdia=new JLabel("<html><h1>Dia:</h1></html>") ;
      cxdia=new JComboBox();
      for(int i=1;i<=31;i++) cxdia.addItem(i);
      
      txmes=new JLabel("<html><h1>Mes:</h1></html>") ;
      cxmes=new JComboBox();
      for(int i=1;i<=12;i++) cxmes.addItem(i);
      
      txano=new JLabel("<html><h1>Ano:</h1></html>") ;
      cxano=new JComboBox();
      for(int i=1940;i<=2050;i++) cxano.addItem(i);
      
      cxdia.setSelectedIndex(-1);
	  cxmes.setSelectedIndex(-1);
	  cxano.setSelectedIndex(-1);
	  
      bt1=new JButton ("<html><h1>Processar<h1></html>"); bt1.addActionListener(this);
      
      txdata=new JLabel("<html><h1>Data:</h1></html>");
      tipofonte=new Font("Arial",Font.BOLD|Font.ITALIC,36);
      txdata.setFont(tipofonte);
      txdata.setForeground(Color.black);
      
      bt2=new JButton ("<html><h1>resetar<h1></html>"); bt2.addActionListener(this);
      
      add(img); 
      add(txdia); add(cxdia);
      add(txmes); add(cxmes); 
      add(txano); add(cxano);
      add(bt1);
      add(txdata); add(bt2);
      
      
      setLayout(new FlowLayout());
      //setLayout(new FlowLayout()); //biblioteca java.awt layouts
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      //show();
   
   }
   public static void main (String args[])
   { 
      new JTestadata();
   }
}
