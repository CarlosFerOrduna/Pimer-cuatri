package PracticandoJava;

import java.util.Random;

import javax.swing.JOptionPane;

public class Secuenciales3 {

	public static void main(String[] args) {

//		Se debe desarrollar un programa que pida el ingreso del precio (n�mero decimal) de un
//		art�culo y la cantidad (n�mero entero) que lleva el cliente. Mostrar lo que debe abonar el
//		comprador (cantidad por el precio del art�culo).

		double precio = 0, resultado;
		int cantidad;
		
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos"));
		
		Random aleatorio = new Random();

		precio = precio + aleatorio.nextDouble();
		
		resultado = precio * cantidad;
		
		System.out.println("El resultado es: " + resultado);
		System.out.println(precio);
	}

}
