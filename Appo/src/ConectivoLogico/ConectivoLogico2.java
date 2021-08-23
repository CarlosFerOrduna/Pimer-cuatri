package ConectivoLogico;
import javax.swing.JOptionPane;
public class ConectivoLogico2 {

	public static void main(String[] args) {
		//Realizar un programa en el cual se calcule el precio total de la entrada a un cine que se le debe
		//cobrar a una persona. Se debe ingresar el precio de la entrada y si es “menor”, “activo” o
		//“jubilado”. Si es menor o jubilado se le realiza un 25% de descuento al precio de la entrada, en
		//caso contrario no tiene descuento.
		
		double precio, total;
		String categoria;
		
		precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la entrada"));
		categoria = JOptionPane.showInputDialog("Ingrese su categoria");
		
		if (categoria.equalsIgnoreCase("menor") || categoria.equalsIgnoreCase("jubilado")) {
			total = precio * 0.75;
		}else {
			total = precio;
		}
		
		JOptionPane.showMessageDialog(null, "El total a pagar es de $" + total);
		
		
		
		
		
		
		

	}

}
