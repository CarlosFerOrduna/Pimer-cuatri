package CondicionalesaAnidados;

import javax.swing.JOptionPane;

public class CondicionalesAnidados4 {

	public static void main(String[] args) {

		// Dados 3 números enteros diferentes ordenarlos en forma descendente.

		int primero, segundo, tercero, mayor, medio, menor;

		primero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primero numero"));
		segundo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
		tercero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));
		mayor = 0;
		medio = 0;
		menor = 0;

		if (primero > segundo && segundo > tercero) {
			mayor = primero;
			medio = segundo;
			menor = tercero;
		} else if (primero > tercero && tercero > segundo) {
			mayor = primero;
			medio = tercero;
			menor = segundo;
		} else if (segundo > primero && primero > tercero) {
			mayor = segundo;
			medio = primero;
			menor = tercero;
		} else if (segundo > tercero && tercero > primero) {
			mayor = segundo;
			medio = tercero;
			menor = primero;
		} else if (tercero > primero && primero > segundo) {
			mayor = tercero;
			medio = primero;
			menor = segundo;
		} else if (tercero > segundo && segundo > primero) {
			mayor = tercero;
			medio = segundo;
			menor = primero;
		} else {
		}

		JOptionPane.showMessageDialog(null, "El numero mas grande es " + mayor + " el numero del medio es " + medio
				+ " el numero mas chico es " + menor);

	}

}
