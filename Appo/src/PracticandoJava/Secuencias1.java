package PracticandoJava;
import java.util.Random;

public class Secuencias1 {

	public static void main(String[] args) {
//		1) Escribir un programa en el cual se ingresan cuatro n�meros enteros. Se pide informar la
//		suma de los dos primeros y el producto del tercero y el cuarto.

		int resultadoSuma, resultadoProducto, guarda = 0;
		
		int [] numeros = new int[4];
		
		Random rnd = new Random();
		
		for (int i = 0 ; i < numeros.length; i++) {
			numeros[i] = rnd.nextInt(100);
			 guarda = guarda + numeros[i];
			
		}
		resultadoSuma = numeros[0] + numeros[1];
		resultadoProducto = numeros[2] * numeros[3];
		
		
		
		System.out.println("El resultado de la suma es: " + resultadoSuma);
		System.out.println("El resultado del producto es: " + resultadoProducto);
		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.println(numeros[3]);
		
	}

}
