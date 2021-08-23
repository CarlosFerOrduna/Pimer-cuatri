package Condicionales;
import javax.swing.JOptionPane;
public class EjercicioCondicional4 {

	public static void main(String[] args) {
		
	double precio;
	String efectivo;
	
	precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto en efectivo"));
	efectivo = JOptionPane.showInputDialog("Ingrese el metodo de pago");

	if(efectivo.equalsIgnoreCase("efectivo")) {
	precio = precio - 50;
	JOptionPane.showMessageDialog(null, "El total a pagar es:" +  "$" + precio);
	
	
	
	}	else { 
			
	JOptionPane.showMessageDialog(null, "El total a oagar es:" + "$" + precio);	
	
	}
		
		
		
		
	}

}
