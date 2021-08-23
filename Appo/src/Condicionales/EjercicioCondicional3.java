package Condicionales;
import javax.swing.JOptionPane;

public class EjercicioCondicional3 {

	public static void main(String[] args) {
	
	double precio, metros, metrosMayores;
	
	metros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de metro gastados"));
	precio = 15.80;
	metrosMayores = (metros - 150);
	
	
	if(metros<=150) {
	
		JOptionPane.showMessageDialog(null, "El total a pagar es:" + "$" + precio );
	
	}else {
	if(metros>150) {	
		
	metros = precio + (metrosMayores * 1.5);
		
		JOptionPane.showMessageDialog(null, "El total a pagar es:" + "$" + metros);
		
	}else {
	
	
		
		
	}
	}
	}
	
	
}	
	


