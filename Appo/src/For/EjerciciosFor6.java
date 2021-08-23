package For;
import javax.swing.JOptionPane;
public class EjerciciosFor6 {

	public static void main(String[] args) {
		//6) Dados n números enteros calcular el rango. Rango: es la diferencia entre el
		//número mayor y el menor

		int cantidadNumeros, numeros, mayor = 0, menor = 0, radio = 0;
		
		cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros"));
		
		for(int i = 0 ; i < cantidadNumeros; i++) {
			
			numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los numeros"));
			
		if(i == 0) {
			menor = numeros;
		}else if(numeros > menor){
			mayor = numeros;
		}else {
			
		}
		radio = mayor - menor;
		
		
		
		}JOptionPane.showMessageDialog(null, "El radio es: " + radio);
		
		
		
	}

}
