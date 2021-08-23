package ConectivoLogico;
import javax.swing.JOptionPane;
public class ConectivoLogico3 {

	public static void main(String[] args) {
		// 3) Dados 2 números, se pide calcular la división solo en el caso que el primero sea mayor que el
		// segundo y el segundo distinto de 0.

	double numerador, denominador, total;
	
		numerador = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numerador"));
		denominador = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el denominador"));
		total = 0;
		if (denominador < numerador && denominador != 0) {
			total = numerador / denominador;
			JOptionPane.showMessageDialog(null, "El resultado es =" + total);
		}else {
			JOptionPane.showMessageDialog(null, "la division no es posible");
			
		}
	}

}

