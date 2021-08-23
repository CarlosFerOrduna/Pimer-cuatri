package Array;
import javax.swing.JOptionPane;
import java.util.Random;

public class EjercicioArray2 {

	public static void main(String[] args) {
//				2) Se tienen las notas del primer parcial de los alumnos de dos cursos (el curso A y el
//				curso B). Las notas de cada curso se guardan en un array y cada curso cuenta con 5
//				alumnos.
//				Realizar un programa que muestre el curso que obtuvo el mayor promedio general.

		Random aleatorio = new Random(10);
		int[][] cursos = new int [5][5];
		
		int primCurso, segCurso;
		double promedioA = 5.0, promedioB;
		
		primCurso = aleatorio.nextInt(10);
		segCurso = aleatorio.nextInt(10);
		
		
		for(int i = 0; i < cursos.length; i++) {
			
			cursos[primCurso][segCurso] = primCurso++ + segCurso++;
			
		}
		
		System.out.println( (primCurso/ promedioA) + " " + (segCurso/promedioA));
	}

//	arreglar con dos array de una dimension.
	
	
	
	
	
}
