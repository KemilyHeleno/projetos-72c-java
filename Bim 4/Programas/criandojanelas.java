import javax.swing.*;
import java.awt.*;
public class criandojanelas
{ // Objeto Janela
   public static void main (String args[])
   {

      //JWindow splash = new JWindow();
      //splash.setBounds(300, 300, 500, 500); // (x,y,larg,altura) setLocation e setSize juntos
       //splash.show();
     
     
     
      JFrame janela = new JFrame("Tabuada-72C Kemily numero 10");
      janela.setSize(600,400);//larg,altu
      janela.setLocation(200,200);//x,y
      janela.getContentPane().setBackground(Color.yellow);
      JLabel     texto1=new JLabel ("digite o numero:");
      JTextField caixa1 = new JTextField(5);
      JButton    botao1 = new JButton("Processar");
      String shtml ="<html><h1>";
      for (int i =1; i<=10;i++) shtml=shtml+"? x"+i+ " =? <br>";
      shtml=shtml+"</h1><html>";
      JLabel      texto2= new JLabel (shtml);
      janela.add(texto1); janela.add(caixa1); janela.add(botao1);janela.add(texto2);
      janela.setLayout(new FlowLayout()); //biblioteca java.awt layouts
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      janela.show();
     }
}
