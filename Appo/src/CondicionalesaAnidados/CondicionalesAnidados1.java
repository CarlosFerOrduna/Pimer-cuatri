package CondicionalesaAnidados;

import javax.swing.JOptionPane;

public class CondicionalesAnidados1 {

	public static void main(String[] args) {
		//Realizar un programa en el cual se debe ingresar el sueldo de un trabajador y la categoría a la
		//cual pertenece y dependendiendo a la categoría a la cual pertenece realizar el incremento
//	    	necesario según la siguiente tabla:

		double sueldo;
		String categoria;
		
		sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo neto"));
		categoria = JOptionPane.showInputDialog("Ingrese su categoria");
		
		if (categoria.equalsIgnoreCase ("a")) {
			 sueldo = sueldo * 1.15;
		}else if (categoria.equalsIgnoreCase("b")) {
			 sueldo = sueldo * 1.10;
		}else if (categoria.equalsIgnoreCase("c")) {
			 sueldo = sueldo * 1.05;
		}else {}
		
		JOptionPane.showMessageDialog(null, "El sueldo a cobrar es $" + sueldo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
