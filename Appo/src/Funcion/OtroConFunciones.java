package Funcion;

import javax.swing.JOptionPane;

public class OtroConFunciones {

	public static void main(String[] args) {
		
		String [] dias = {"domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};
		
		JOptionPane.showMessageDialog(null, "el dia es: " + semana(dias, 0));
		
	}
	
	public static String semana(String []dias, int posicion) {
				
		posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion"));
		
				
		return dias[posicion];
	}

}


