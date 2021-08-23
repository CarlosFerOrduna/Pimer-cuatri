package For;
import javax.swing.JOptionPane;
import java.util.Random;
public class EjercicioFor2 {

	public static void main(String[] args) {
	
	//	2) Generar al azar 20 números en el intervalo (0-100), imprimir la cantidad de ceros
	//	que salieron
		
		int aleatorio, ceros = 0;
		Random rnd = new Random();
		
		for(int i = 0 ; i < 20 ; i++) {
		aleatorio = rnd.nextInt(101);
			if(aleatorio == 0) {
				ceros++;
			}
		JOptionPane.showMessageDialog(null, "el total de ceros es : " + ceros);
			
		
		}
		
		
	}

}
