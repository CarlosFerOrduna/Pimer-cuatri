package Funcion;

import javax.swing.JOptionPane;

public class otro {

	public static void main(String[] args) {
		
		int numero1, numero2, resultado;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
		
		resultado = mayor(numero1, numero2);
		
		System.out.println(resultado);
		
	}
	public static int mayor(int numero1, int numero2) {
		
		if (numero1 < numero2) {
			return numero2;
		}else {
			return numero1;
					
		}
	}

}
