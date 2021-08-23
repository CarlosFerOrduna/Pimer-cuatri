package PracticaParaParcial;

import java.util.Random;

public class Array1 {

	public static void main(String[] args) {

//			1) Desarrollar un programa que genere al azar 8 elementos, e informe:
//			El valor acumulado de todos los elementos del vector.
//			Cantidad de elementos del vector que sean iguales a 36.
//			Cantidad de valores mayores a 50.

		Random rnd = new Random();

		int[] numeros = new int[8];

		int total = 0, igualA36 = 0, mayorA50 = 0;

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = rnd.nextInt(100);

		}
		for (int i = 0; i < numeros.length; i++) {

			total = total + numeros[i];
			
			if (numeros[i] == 36) {
				igualA36++;
			} else if (numeros[i] > 50) {
				mayorA50++;
			}
		}
		System.out.println("El total del array es: " + total);
		System.out.println("Dentro del array hay " + igualA36 + " numeros 36");
		System.out.println("Dentro del array hay " + mayorA50 + " numeros mayores a 50");
	}

}
