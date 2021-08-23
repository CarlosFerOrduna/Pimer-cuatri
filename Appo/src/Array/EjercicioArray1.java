package Array;
import java.util.Random;
public class EjercicioArray1 {

	public static void main(String[] args) {
//			1) Desarrollar un programa que genere al azar 8 elementos, e informe:
//			El valor acumulado de todos los elementos del vector.
//			Cantidad de elementos del vector que sean iguales a 36.
//			Cantidad de valores mayores a 50.
		
		Random aleatorio = new Random();
		
		int[] numeros = new int [8];
		int igual36 = 0, mayor50 = 0, total = 0;
		
		
		
		for(int i = 0 ; i < numeros.length; i++) {
			
			numeros[i] = aleatorio.nextInt(100);
			
			}
		for(int i = 0 ; i < numeros.length; i++) {
			
			total = total + i;
			
			if (numeros[i]==36) {
				
				igual36++;
				
			}else if(numeros[i]>50) {
				
				mayor50++;				
			}
			
			
			
			
		}
			
		System.out.println("iguales a 36: " + igual36);
		System.out.println("mayores a 50: " + mayor50);
		System.out.println("total: " + total);
		
	}

}
