package Secuenciales;
import javax.swing.JOptionPane;
public class EjercicioSecuenciales8 {

	public static void main(String[] args) {
		
		double cantidadDolar, cantidadPesos;
		
		cantidadDolar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en dolares"));
		cantidadPesos = cantidadDolar * 140;
		
		JOptionPane.showMessageDialog(null, "El equivalente en pesos es" + " " + cantidadPesos);
		
		
		
		
		
	}
}