import javax.swing.JOptionPane;

public class NameDialog
{

	static int soma(int numero1, int numero2)
	{
		int soma = numero1 + numero2;

		return soma;
	}

	public static void main(String[] args)
	{
		String numero1 = JOptionPane.showInputDialog("Insira o primeiro numero:");
		String numero2 = JOptionPane.showInputDialog("Insira o segundo numero:");
		int total = soma(Integer.parseInt(numero1), Integer.parseInt(numero2));

		JOptionPane.showMessageDialog(null, String.valueOf(total));
		
	}
}
