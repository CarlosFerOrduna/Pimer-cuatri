package PracticaParaParcial;
import java.util.Random;
public class ArrayMultidimensional {

	public static void main(String[] args) {
		
//		Crear y cargar una matriz de 3 filas por 4 columnas. Imprimir la primera fila e imprimir la
//		primera columna

		int matriz [][][] = new int [4][4][4];
		
		Random rnd = new Random();
		
		for (int i = 0; i < matriz.length; i++) {
			matriz[i][i][i] = rnd.nextInt(100); 
			System.out.println(matriz[i][i][i]);
		}
		
		
		
		
		
		
		
	}

}
