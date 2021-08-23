package Secuenciales;
import javax.swing.JOptionPane;
public class EjercicioSecuenciales1 {

	public static void main(String  []  args) 
	{
	int numero1, numero2, numero3, numero4, resultadoSuma, resultadoMultiplicacion;
	
	numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
	numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
	numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 3"));
	numero4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 4"));
	
	resultadoSuma = numero1 + numero2;
	resultadoMultiplicacion = numero3 * numero4;
	
	JOptionPane.showMessageDialog(null, "El resultado de la suma es" + resultadoSuma);
	JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es" + resultadoMultiplicacion);
	
	}
}
