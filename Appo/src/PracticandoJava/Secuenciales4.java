package PracticandoJava;

import java.util.Random;
public class Secuenciales4 {

	public static void main(String[] args) {
//		1) Dados como datos los sueldos de 10 trabajadores, obtener el total de sueldos
//		pagados en el mes

		int [] sueldos = new int[10];
		
		int pibot = 0, resultado = 0;
		
		Random aleatorio = new Random();
		
		for(int i = 0; i < sueldos.length; i++) {
			sueldos[i] = aleatorio.nextInt(100)+1;
			pibot = pibot + sueldos[0];
		
		resultado = sueldos[0] + sueldos[1] + sueldos[2] + sueldos[3] + sueldos[4] + sueldos[5] + sueldos[6] +
				sueldos[7] + sueldos[8] + sueldos[9];
		
		}
		
		System.out.println("El total de los sueldos es: " + resultado);
		
		System.out.println("primero " + sueldos[0]);
		System.out.println("segundo " + sueldos[1]);
		System.out.println("tercero " + sueldos[2]);
		System.out.println("cuarto " + sueldos[3]);
		System.out.println("quinto " + sueldos[4]);
		System.out.println("sexto " + sueldos[5]);
		System.out.println("septimo " + sueldos[6]);
		System.out.println("octavo " + sueldos[7]);
		System.out.println("noveno " + sueldos[8]);
		System.out.println("decimo " + sueldos[9]);
		
	}

}
