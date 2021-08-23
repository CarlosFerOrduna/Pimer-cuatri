package PracticaParaParcial;
import java.util.Random;
public class Array3 {

	public static void main(String[] args) {
		
//	3) Realizar un programa que lea los tiempos en los que 10 corredores han acabado
//	una carrera. El programa debe determinar qué corredores tienen el primer, segundo y último
//	puesto, así como cuál es el tiempo medio en que se ha corrido la carrera.

		Random rnd = new Random();
		int[] corredores = new int[10];
		int auxiliar = 0;
		double tiempoMedio = 0;

		for (int i = 0; i < corredores.length; i++) {
			corredores[i] = rnd.nextInt(100);
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
			tiempoMedio = (tiempoMedio + corredores[i++]) / corredores.length;
		
		}
		System.out.println("El primer lugar es: " + corredores[9]);
		System.out.println("El segundo lugar es: " + corredores[8]);
		System.out.println("El ultimo lugar es: " + corredores[0]);
		System.out.println("El promedio del tiempo es: " + tiempoMedio);

}
}