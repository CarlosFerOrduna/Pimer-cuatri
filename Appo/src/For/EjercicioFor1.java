package For;
import javax.swing.JOptionPane;
public class EjercicioFor1 {

	public static void main(String[] args) {
		
		int sueldo, sueldoTotal = 0;
		
		for(int i = 0; i < 10 ; i++) {
			sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos."));
			sueldoTotal = sueldo + sueldoTotal;
		}
		JOptionPane.showMessageDialog(null, "el sueldo total es : &" + sueldoTotal);

	}

}
