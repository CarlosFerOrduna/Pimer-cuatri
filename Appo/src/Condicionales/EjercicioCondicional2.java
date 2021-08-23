package Condicionales;
import javax.swing.JOptionPane;
public class EjercicioCondicional2 {

	public static void main(String[] args) {
		
		
		double sueldo;
		String categorias;
		
		sueldo = Double.parseDouble(JOptionPane.showInputDialog("ingrese su sueldo"));
		
		categorias = (JOptionPane.showInputDialog("Ingrese su categoria"));
		
		if(categorias.equalsIgnoreCase("a")) {
		
		sueldo = sueldo + 100;
		
		
		}else 
				
				
		sueldo = sueldo + 300;
			
		JOptionPane.showMessageDialog(null,  "$" + sueldo);
		
		}
	}
			
			
			
			
			


