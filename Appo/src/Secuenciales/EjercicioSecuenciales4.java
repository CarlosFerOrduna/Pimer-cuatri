package Secuenciales;
import javax.swing.JOptionPane;
public class EjercicioSecuenciales4 {

	public static void main(String[] args) {
		
		int matricula;
		double calificacion1, calificacion2, calificacion3, suma, promedio;
		
		matricula = Integer.parseInt(JOptionPane.showInputDialog("La matricula es"));
		calificacion1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera calificacion"));
		calificacion2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda calificacion"));
		calificacion3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera calificacion"));
		
		
		suma = calificacion1 + calificacion2 + calificacion3;
		promedio = suma / 3.0;
		
		JOptionPane.showMessageDialog(null, "La matricula es" + " " + matricula);
		JOptionPane.showMessageDialog(null, "El promedio es" + " " + promedio);
		
		
		
		
		
		

	}

}
