package Secuenciales;
import javax.swing.JOptionPane;
public class EjercicioSecuenciales3 {

	public static void main(String[] args) {
		
		int cantidad;
		double precio, total;
		
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
		precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
		total = cantidad * precio;
		
		JOptionPane.showMessageDialog(null,"Precio final" + total);
		
		

	}

}
