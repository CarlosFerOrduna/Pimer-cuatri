package ConectivoLogico;
import javax.swing.JOptionPane;


public class ConectivoLogico1 {

	public static void main(String[] args) {
		//Hacer un programa para calcular el precio de un billete de tren, conociendo la distancia del
		//viaje y el tiempo de estancia. Se sabe además que si el número de días de estancia es superior a
		//7 y la distancia total a recorrer es superior a 800 km, el billete tiene un descuento del 30%. El
		//precio por km es de $3.70. Indica cuánto debe abonar.

			double distancia, estancia, total;		
		
		distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia del viaje"));
		estancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los dias de estancia"));
		
		
		if (distancia >= 800 && estancia >= 7) {
			total = distancia * 3.7 * 0.7;
		}else {
			total = distancia * 3.7;
		}
	JOptionPane.showMessageDialog(null, "El total a pagar es $" + total);		

	}

	
	
		
	}


