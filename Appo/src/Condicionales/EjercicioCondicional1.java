package Condicionales;
import javax.swing.JOptionPane;
public class EjercicioCondicional1 {

	public static void main(String[] args) {
	
		
		double nota;
		
		nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota"));
		
		
		if (nota >= 4) { 
			JOptionPane.showMessageDialog(null, "Aprovado");
			
		}else { 
			JOptionPane.showMessageDialog(null, "Desaprovado");
		}
		
		
		
		
		
		
	}

}
