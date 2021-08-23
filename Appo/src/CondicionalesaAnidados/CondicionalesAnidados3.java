package CondicionalesaAnidados;

import javax.swing.JOptionPane;

public class CondicionalesAnidados3 {

	public static void main(String[] args) {
		// Dados los datos A, B y C que representan números enteros diferentes. Calcular
		// cual es el
		// mayor.

		int A, B, C, resultado;

		A = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion A"));
		B = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion B"));
		C = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion C"));
		resultado = 0;
		if (A > B && B > C) {
			resultado = A;
		} else if (A > C && C > B) {
			resultado = A;
		} else if (B > A && A > C) {
			resultado = B;
		} else if (B > C && C > A) {
			resultado = B;
		} else if (C > A && A > B) {
			resultado = C;
		} else if (C > B && B > A) {
			resultado = C;
		} else if (A > B && B == C) {
			resultado = A;
		} else if (B > A && A == C) {
			resultado = B;
		} else if (C > A && A == B) {
			resultado = C;
		}
JOptionPane.showMessageDialog(null, "El numero mayor es " + resultado);
		{
		}if (A == B && B == C) {
			JOptionPane.showMessageDialog(null, "La opcion no es posible");
		} else if (A < B && B == C) {
			JOptionPane.showMessageDialog(null, "La opcion no es posible");
		} else if (B < A && A == C) {
			JOptionPane.showMessageDialog(null, "La opcion no es correcta");
		} else if (C < B && B == A) {
			JOptionPane.showMessageDialog(null, "La opcion no es correta");
		}

	}

}
