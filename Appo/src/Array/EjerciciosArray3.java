package Array;

public class EjerciciosArray3 {
	public static void main(String[] args) {

//	3) Realizar un programa que lea los tiempos en los que 10 corredores han acabado
//	una carrera. El programa debe determinar qué corredores tienen el primer, segundo y último
//	puesto, así como cuál es el tiempo medio en que se ha corrido la carrera.

		int[] corredores = new int[10];
		int auxiliar = 0;

		for (int i = 0; i < corredores.length; i++) {
			corredores[i] = i;
		}
		for(int j = 0; j < corredores.length - 1; j++) {
		for (int i = 0; i < corredores.length - 1; i++) {
			
			
			if (corredores[i] < corredores[i + 1]) {
				
				auxiliar = corredores[i];
				corredores[i] = corredores[i + 1];
				corredores[i+1] = auxiliar;
			}
			}	
		}
		for (int i = 0; i < corredores.length ; i++) {
			System.out.println(corredores[i]);
		}
	}
}