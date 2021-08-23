package Secuenciales;
import javax.swing.JOptionPane;
public class EjercicioSecuenciales6 {

	public static void main(String[] args) {
		
		double dinero, costo, cambio;
		
		dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto recibido"));
		costo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a pagar"));
		
		cambio = costo - dinero;
		
		JOptionPane.showMessageDialog(null, "El cambio es" + " " + cambio);
		
		
	}

}
