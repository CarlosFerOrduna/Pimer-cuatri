package CondicionalesaAnidados;
import javax.swing.JOptionPane;
public class CondicionalesAnidados2 {

	public static void main(String[] args) {
		//Dados 3 números decimales, si el primero es mayor que el segundo pero menor que el tercero
		//se debe sumar los tres datos, en cualquier otro caso se multiplicarán.
	
	
	double primero, segundo, tercero, resultado;
	
	primero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
	segundo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
	tercero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer numero"));
	resultado = 0;
	
	if (primero > segundo && segundo > tercero) {
		resultado = primero * segundo * tercero;
	}else if (primero > tercero && tercero > segundo){
		resultado = primero * segundo * tercero;
	}else if (segundo > primero && primero > tercero) {
		resultado = primero * segundo * tercero;
	}else if (segundo > tercero && tercero > primero) {
		resultado = primero * segundo * tercero;
	}else if (tercero > primero && primero > segundo) {
		resultado = primero + segundo + tercero;
	}else if (tercero > segundo && segundo > primero) {
		resultado = primero * segundo * tercero;
	}else if (primero > segundo && segundo == tercero) {
		resultado = primero * segundo * tercero;
	}else if (segundo > primero && primero == tercero) {
		resultado = primero * segundo * tercero;
	}else if (tercero > primero && primero == segundo) {
		resultado = primero * segundo * tercero;
	}else if (primero == segundo && segundo == tercero) {
		resultado = primero * segundo * tercero;
	}else if (primero < segundo && segundo == tercero) {
		resultado = primero * segundo * tercero;
	}else if (segundo < primero && primero == tercero) {
		resultado = primero * segundo * tercero;
	}else if (tercero < primero && primero == segundo) {
		resultado = primero * segundo * tercero;
	}
	
	
	
	
	
	JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
