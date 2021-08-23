package Secuenciales;
import javax.swing.JOptionPane;
public class EjercicioSecuenciales5 {

	public static void main(String[] args) {
	
		
		int caja, disco;
		double precio;
		
		caja = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de cajas"));
		disco = caja * 10;
		precio = caja * 5.80;

		
		JOptionPane.showMessageDialog(null, "el total de discos es:" + disco );
		JOptionPane.showMessageDialog(null, "El precio total es:" + precio);
		

	}

}
