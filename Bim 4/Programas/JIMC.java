import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
 class JIMC extends JFrame implements ActionListener
{ // Objeto Janela
	private ImageIcon ft1,ft2;
	private JLabel img1,img2;
	
	private JLabel text1,text2;
	private JTextField cxpeso,cxalt;;
	private JButton btn1,btn2;
	private JTextArea saida;
	private double vpeso,valt,vimc;
	
	
   public void actionPerformed(ActionEvent aaee)
   {
	   if(aaee.getSource()==btn1)
	   {
		    try
			{
				vpeso=Double.parseDouble(cxpeso.getText());
				valt=Double.parseDouble(cxalt.getText());
				vimc=vpeso/(valt*valt);
				saida.append("\n"+vimc);
				if(vimc<18.5)
				{
				
					ft2=new ImageIcon("imc185.png");
					img2.setIcon(ft2);
					return;
				}
				if(vimc<25)
				{
					ft2=new ImageIcon("imc249.png");
					img2.setIcon(ft2);
					return;
				}
				
				if(vimc<30)
				{
					ft2=new ImageIcon("imc299.png");
					img2.setIcon(ft2);
					return;
				}
				if(vimc<35)
				{
					ft2=new ImageIcon("imc349.png");
					img2.setIcon(ft2);
					return;
				}
				if(vimc<40)
				{
					ft2=new ImageIcon("imc400.png");
					img2.setIcon(ft2);
					return;
				}
		}catch(Exception erro)
			{
				cxpeso.setText("");
				cxalt.setText("");
				cxpeso.grabFocus();
		   
			}
	   }
	   if(aaee.getSource()==btn2)
	   {
		   ft2=new ImageIcon("tabelaimcjava.png");
		   img2.setIcon(ft2);
		   saida.setText("resultado:");
		   cxpeso.setText("");
		   cxalt.setText("");
		   cxpeso.grabFocus();
	   }
	  
   }
   public  JIMC()
   {
	  super("72C Kemily - 10");
      setSize(1000,1000);//larg,altu
      setLocation(200,200);//x,y
      getContentPane().setBackground(Color.cyan);
      
      ft1=new ImageIcon("tabelaimcmf.png");
      img1=new JLabel(ft1);
      
      text1=new JLabel("<html><h1>Peso: </h1></html>") ;
      cxpeso=new JTextField (5);
      
      text2=new JLabel("<html><h1>Altura: </h1></html>") ;
      cxalt=new JTextField (5);
      
      btn1=new JButton ("<html><h1>Processar<h1></html>"); btn1.addActionListener(this);
      saida=new JTextArea("Resultado:",3,1);
      
      ft2=new ImageIcon("tabelaimcjava.png");
      img2=new JLabel(ft2);
      
      btn2=new JButton ("<html><h1>resetar<h1></html>"); btn2.addActionListener(this);
      
      add(img1); add(text1); add(cxpeso);
      add(text2); add(cxalt); add(btn1);
      add(saida); add(img2); add(btn2);
      
      
      setLayout(new FlowLayout());
      //setLayout(new FlowLayout()); //biblioteca java.awt layouts
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      //show();
   
   }
   public static void main (String args[])
   { 
      new JIMC();
   }
}
