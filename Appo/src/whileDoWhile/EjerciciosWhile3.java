package whileDoWhile;

import javax.swing.JOptionPane;

public class EjerciciosWhile3 {

	public static void main(String[] args) {
//		3) Se desea calcular el puntaje de un equipo de f�tbol al finalizar el campeonato. Se
//		distinguen con la letra �G� los partidos ganados, con �E� los empatados y con �P� los
//		perdidos. Para indicar el fin se ingresara un � * � - realizar el programa -
//		modificar el programa anterior de modo tal que indique el n�mero de partidos ganados, el de perdidos y
//		el de empatados

		String partidos;
		double ganados = 0, empatados = 0, perdidos = 0;

		partidos = JOptionPane.showInputDialog("Ingrese como acabo cada partido");

		while (!partidos.equals("*")) {

			if (partidos.equalsIgnoreCase("g")) {

				ganados++;

			} else if (partidos.equalsIgnoreCase("e")) {
				empatados++;

			} else {
				perdidos++;
			}
			
			partidos = JOptionPane.showInputDialog("Ingrese como acabo cada partido");
			
		}
		System.out.println("el total de puntos es: " + ((ganados*3)+empatados));
		System.out.println("El total de partidos ganados es: " + ganados);
		System.out.println("El total de partidos empatados es: " + empatados);
		System.out.println("El total de partidos perdidos es: " + perdidos);
		System.out.println("El porcentaje de ganados es: " + (ganados * 100 / (ganados + empatados + perdidos)));
		System.out.println("El porcentaje de empatados es: "  + (empatados * 100 / (ganados + empatados + perdidos)));
		System.out.println("El porcentaje de perdidos es: "  + (perdidos * 100 / (ganados + empatados + perdidos)));
	}
}
