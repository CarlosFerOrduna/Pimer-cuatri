package Condicionales;
import javax.swing.JOptionPane;
public class EjercicoCondicional6 {

	public static void main(String[] args) {
		// Realizar un programa que realice la división de dos números decimales. El programa debe
		//verificar que el denominador no sea cero (0). Por ejemplo: 2/0 esto no es correcto y el
		//programa debe avisar al usuario que “La división por cero no es posible”

		double numerador, denominador, resultado;
		
		numerador = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numerador"));
		denominador = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el denominador"));
		resultado = numerador / denominador;
		
		
		if (denominador == 0) {
		
			JOptionPane.showMessageDialog(null, "La division por cero no es posible");
			
		}else {
			JOptionPane.showMessageDialog(null, "El resultado es = " + resultado);
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
