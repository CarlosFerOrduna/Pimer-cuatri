package Secuenciales;
import javax.swing.JOptionPane;
public class EjercicioSecuenciales2 {

	public static void main(String[] args) {

		int numero1, numero2, numero3, numero4, suma;
		double promedio;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 3"));
		numero4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 4"));
		
		suma = numero1 + numero2 + numero3 + numero4;
		promedio = suma / 4.0;
		
		JOptionPane.showMessageDialog(null,"El resultado de la suma es" + " " + suma );
		JOptionPane.showMessageDialog(null, "El promedio es" + " " + promedio);
		
	}

}
