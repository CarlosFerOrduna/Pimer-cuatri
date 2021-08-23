package Funcion;

import javax.swing.JOptionPane;

public class FuncionRestar {

	public static void main(String[] args) {

		int resultado, numero1, numero2;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero1"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero2"));
		resultado = restar(numero1, numero2);

		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

	}

	public static int restar(int numero1, int numero2) {

		int resultado;

		resultado = numero1 - numero2;

		return resultado;

	}

}
