package For;
import javax.swing.JOptionPane;
public class EjercicioFor4 {

	public static void main(String[] args) {
		
		int cantidadNumeros;

		
		cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros"));		
		
		int[] array = new int[cantidadNumeros];
		
		for (int i = 0 ; i < array.length; i++) {
			i = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato") + (i+1) + ": ");
			
			array [i] = cantidadNumeros;
		
		}
	int menor;
	
	menor = array[0];
	
		for(int i = 0; i < array.length; i++) {
			if(array[i] < menor) {
				
			}
		}
	
	
	}

}	