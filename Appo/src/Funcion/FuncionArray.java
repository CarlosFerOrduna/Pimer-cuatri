package Funcion;
import javax.swing.JOptionPane;
import java.util.Random;
public class FuncionArray {

	public static void main(String[] args) {
		Random aleatorio = new Random (3);
		int numeros [] = new int[3];
		
		numeros[0] = aleatorio.nextInt(3);
		numeros[1] = aleatorio.nextInt(3);
		numeros[2] = aleatorio.nextInt(3);
	
	int resultado = mayor(numeros);	
	JOptionPane.showMessageDialog(null, "El mayo es: " + resultado);
	
	}public static int mayor(int [] enteros) {
		
		int mayor = 0;
		
		for (int i = 0 ; i < enteros.length ; i++) {
			
			if(i == 0) {
				mayor = enteros[i];
			}else {
				if(enteros [i] > mayor) {
					mayor = enteros[i];
				}
			
			}
			
			
		}
		return mayor;
	}

}
