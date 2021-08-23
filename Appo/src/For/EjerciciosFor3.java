package For;

import javax.swing.JOptionPane;
import java.util.Random;

public class EjerciciosFor3 {

	public static void main(String[] args) {
		// 3) Generar 100 números al azar y verificar la cantidad que salieron entre 0 y
		// 25, la
		// cantidad entre 25 y 50, la cantidad entre 50 y 75 y la cantidad entre 75 y
		// 100

		Random rnd = new Random();
		int numeros, veinticinco = 0, cincuenta = 0, setentaycinco = 0, cien = 0;

		for (int i = 0; i < 100; i++) {
			numeros = rnd.nextInt(101);
			if (numeros >= 0 && numeros <= 25) {
				veinticinco++;
			} else if (numeros >= 26 && numeros <= 50) {
				cincuenta++;
			} else if (numeros >= 51 && numeros <= 75) {
				setentaycinco++;
			} else {
				cien++;
			}
		}

		JOptionPane.showMessageDialog(null, "El total de numeros entre 0 y 25 : " + veinticinco + " entre 26 y 50 : "
				+ cincuenta + " entre 51 y 75 : " + setentaycinco + " entre 76 y 100 : " + cien);

	}

}
