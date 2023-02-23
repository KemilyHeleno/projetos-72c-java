import javax.swing.*;
import java.awt.*;
import java.util.*;

class JAdivinhanumero
{ // Objeto Janela
	public static void main (String args[])
	{
		JFrame janela = new JFrame("Adivinhe o número-72C Kemily numero 10");
		janela.setSize(600,400);//larg,altu
		janela.setLocation(200,200);//x,y
		janela.getContentPane().setBackground(Color.cyan);
		JLabel     texto1 = new JLabel ("digite o numero:");
		JTextField caixa1 = new JTextField(5);
		JButton    botao1 = new JButton("Processar");
	}
	public void ActionEvent
	{
		
	}
	private int valor1, valor2;
	private Random gerador;
	public void actionPerformed (ActionEvent abcd)
	{
		if (abcd.getSource() == botao1)
		{
			try
			{
				valor2 = Integer.parseInt (caixa1.get.Text());
				if (valor2 == valor1)
					caixa2.append (" " +valor2+ " Meus parabéns, Acertou ");
				if (valor2 < valor1)
					caixa2.append (" " +valor2+ " eh menor hein ");
				if (valor2 > valor1)
					caixa2.append (" " +valor2+ " eh maior hein");
				caixa1.setText("");
				caixa1.grabFocus();
			}catch (Exception erro)
			{
				caixa1.setText ("");
				caixa1.grabFocus ();
			}
		}
		if(abcd.getSource()==botao2)
		{
			valor1=gerador.nextInt (36);
			caixa2.setText ("Valores digitados: ");
			caixa1.grabFocus();
			return;
		}
	}
}
