package PracticaParaParcial;

import java.util.Random;

public class Array2 {

	public static void main(String[] args) {
//				2) Se tienen las notas del primer parcial de los alumnos de dos cursos (el curso A y el
//				curso B). Las notas de cada curso se guardan en un array y cada curso cuenta con 5
//				alumnos.
//				Realizar un programa que muestre el curso que obtuvo el mayor promedio general.

		Random rnd = new Random();

		double promedioA = 0, promedioB = 0, promedioMasAlto = 0, total = 0;

		int[] cursoA = new int[5];
		int[] cursoB = new int[5];

		for (int i = 0; i < cursoA.length; i++) {

			cursoA[i] = rnd.nextInt(10)+1;

			total = total + cursoA[i];
			
			promedioA = total / cursoA.length;
		}
		for (int i = 0; i < cursoB.length; i++) {

			cursoB[i] = rnd.nextInt(10)+1;

			total = total + cursoB[i];
			
			promedioB = total / cursoB.length;
		}

		if (promedioA < promedioB) {

			promedioMasAlto = promedioB;

		} else {

			promedioMasAlto = promedioA;
		}

		System.out.println("El promedio del curso A es: " + promedioA);
		System.out.println("El promedio del curso B es: " + promedioB);
		System.out.println("El promedio mas alto es " + promedioMasAlto);

	}

}
