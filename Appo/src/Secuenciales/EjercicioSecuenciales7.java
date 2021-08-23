package Secuenciales;
import javax.swing.JOptionPane;
public class EjercicioSecuenciales7 {

	public static void main(String[] args) {
	
		double lado, perimetro, area;
		
		lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado"));
		
		perimetro = lado + lado + lado + lado;
		
		area = lado * lado;
		
		JOptionPane.showMessageDialog(null, "El perimetro es" + " " + perimetro);
		JOptionPane.showMessageDialog(null, "El area es" + " " + area);
		
	
		
		
	
	}

}
