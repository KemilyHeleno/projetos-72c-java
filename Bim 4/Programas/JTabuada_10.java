import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class JTabuada_10 extends JFrame implements ActionListener
{ // Objeto Janela
	private JLabel txt1,txt2;
	private JTextField caixa1;
	private JButton btn1;
	private String shtml;
	private int valor;
   public void actionPerformed(ActionEvent e)
   {
	   try
	   {
	      valor=Integer.parseInt(caixa1.getText());
	     shtml="<html><h1>";
         for (int i =1; i<=10;i++) shtml=shtml+valor+" x"+i+ " = "+valor*i+" <br>";
            shtml=shtml+"</h1><html>";
            
            txt2.setText(shtml);
       }catch(Exception erro)
       {
		   caixa1.setText(""); caixa1.grabFocus();
		   
	   }
   }
   public  JTabuada_10()
   {
	   super("72C Kemily - 10");
      setSize(600,400);//larg,altu
      setLocation(200,200);//x,y
      getContentPane().setBackground(Color.orange);
      
      txt1=new JLabel ("digite o numero:");
      caixa1 = new JTextField(5);
      btn1 = new JButton("Processar"); btn1.addActionListener(this);
      
      shtml ="<html><h1>";
		  for (int i =1; i<=10;i++) shtml=shtml+10+" x "+i+ " = "+10*i+" <br>";
            shtml=shtml+"</h1><html>";
      txt2= new JLabel (shtml);
      
      add(txt1); add(caixa1); add(btn1);add(txt2);
      setLayout(new FlowLayout()); //biblioteca java.awt layouts
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      show();
   
   }
   public static void main (String args[])
   { 
      new JTabuada_10();
   }
}
