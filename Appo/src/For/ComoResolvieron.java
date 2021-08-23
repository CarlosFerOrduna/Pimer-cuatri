package For;
import javax.swing.JOptionPane;

public class ComoResolvieron {

	public static void main(String[] args) {
		
		int numeros, numeroMenor = 0, cantidadNumeros;
		
		cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de numeros"));
		
		for(int i= 0; i < cantidadNumeros; i++)	{
			
			numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese uno de los numeros"));
			
			if(i == 0) {
				numeroMenor = numeros;
			}
			else if(numeros < numeroMenor) {
				numeroMenor = numeros;
			}
		}
		
		JOptionPane.showMessageDialog(null, "el numero menor es: " + numeroMenor);

		
		
		
	}	

}
