package PracticandoJava;
import java.util.Random;

public class Secuencias2 {
public static void main(String[]args) {
	
//	Escribir un programa en el cual se ingresan cuatro n�meros enteros. Se pide informar su
//	suma y promedio.
	
	int caja = 0, suma, producto;
	
	int [] numeros = new int [4];
	
	Random rnd = new Random();
	
	for (int i = 0; i < numeros.length; i++) {
		numeros[i] = rnd.nextInt(100);
		
		caja = caja + numeros[i];
	}
	
	suma = numeros[0] + numeros[1] + numeros[2] + numeros[3];
	producto = numeros[0] * numeros[1] * numeros[2] * numeros[3];
	
	
	System.out.println("El resultado del producto es: " + producto);
	System.out.println("El resultado de la suma es: " + suma);
	System.out.println(numeros[0]);
	System.out.println(numeros[1]);
	System.out.println(numeros[2]);
	System.out.println(numeros[3]);
}
}
