import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
 class JAdivinha_numero extends JFrame implements ActionListener
{ // Objeto Janela
	private JLabel texto1;
	private JTextField caixa1;
	private JButton btn1,btn2;
	private JTextArea caixa2;
	private String shtml;
	private int val1,val2;
	private Random gerador;
	
   public void actionPerformed(ActionEvent aaee)
   {
	   if(aaee.getSource()==btn1)
	   {
		    try
			{
				val2=Integer.parseInt(caixa1.getText());
				if(val2==val1)
				   caixa2.append("\n"+val2+" Acertou!!!");
				if(val2>val1)
				   caixa2.append("\n"+val2+" eh Menor");
				if(val2<val1)
				   caixa2.append("\n"+val2+" eh Maior");
            
				caixa1.setText(""); caixa1.grabFocus();
		}catch(Exception erro)
			{
				caixa1.setText(""); caixa1.grabFocus();
		   
			}
	   }
	   if(aaee.getSource()==btn2)
	   {
		   val1=gerador.nextInt(36);
		   caixa2.setText("Valores digitados:");
		   caixa1.grabFocus();
		   return;
	   }
	  
   }
   public  JAdivinha_numero()
   {
	  super("72C Kemily - 10");
      setSize(800,400);//larg,altu
      setLocation(200,200);//x,y
      getContentPane().setBackground(Color.cyan);
      
      texto1=new JLabel ("<html><h1>Numero gerado.<br>Adivinhe o numero:</h1><html>");
      caixa1 = new JTextField(5);
      btn1 = new JButton("Processar"); btn1.addActionListener(this);
      caixa2 =new JTextArea("valores digitados",15,1);
      btn2 = new JButton("Resetar"); btn2.addActionListener(this);
	  gerador = new Random();
	  val1=gerador.nextInt(36);  
      
      add(texto1); add(caixa1); add(btn1);add(caixa2);add(btn2);
      
      setLayout(new FlowLayout());
      //setLayout(new FlowLayout()); //biblioteca java.awt layouts
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      //show();
   
   }
   public static void main (String args[])
   { 
      new JAdivinha_numero();
   }
}
