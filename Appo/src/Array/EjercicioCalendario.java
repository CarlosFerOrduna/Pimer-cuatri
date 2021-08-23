package Array;

import java.util.Random;

public class EjercicioCalendario {

	public static void main(String[] args) {

		
		
		
		
		
	//Math.random();							libreria de 0 al 1;
		Random aleatorio = new Random (11);   // esto 
											//  + esto
		aleatorio.nextInt();				//del 1 al 10
	
		int[][] matriz = new int[3][4];
		
		matriz[0][0] = aleatorio.nextInt(10)+1;
		matriz[0][1] = aleatorio.nextInt(10)+1;
		matriz[0][2] = aleatorio.nextInt(10)+1;
		matriz[0][3] = aleatorio.nextInt(10)+1;
		
		matriz[1][0] = aleatorio.nextInt(10)+1;
		matriz[1][1] = aleatorio.nextInt(10)+1;
		matriz[1][2] = aleatorio.nextInt(10)+1;
		matriz[1][3] = aleatorio.nextInt(10)+1;
		
		matriz[2][0] = aleatorio.nextInt(10)+1;
		matriz[2][1] = aleatorio.nextInt(10)+1;
		matriz[2][2] = aleatorio.nextInt(10)+1;
		matriz[2][3] = aleatorio.nextInt(10)+1;
			
				System.out.println("la fila es");
			for(int i = 0 ; i < 4 ; i++) {
				
				System.out.println(matriz[0][i]);
				
			}
			System.out.println("la columna es");
			for(int i = 0 ; i < 3 ; i++) {
				System.out.print(matriz[i][0]);
			}
		
		
		
		
	}

}
