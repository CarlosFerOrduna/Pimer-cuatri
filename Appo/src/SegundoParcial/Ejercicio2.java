package SegundoParcial;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {

		String resultadoDelPartido;
		double ganados = 0, empatados = 0, perdidos = 0, totalPartidos = 0, totalPuntos = 0,
				ganadosPuntos = 0, empatadosPuntos = 0;
		
		resultadoDelPartido  = JOptionPane.showInputDialog("Ingrese el resultado del partido");
		
		while (!resultadoDelPartido.equalsIgnoreCase("+")) {
			if(resultadoDelPartido.equalsIgnoreCase("g")) {
				ganadosPuntos = ganados + 6;
				ganados++;
			}else if(resultadoDelPartido.equalsIgnoreCase("e")) {
				empatadosPuntos = empatados + 3;
				empatados++;
			}else if(resultadoDelPartido.equalsIgnoreCase("p")) {
				perdidos++;
			}
			totalPuntos = ganadosPuntos + empatadosPuntos;
			totalPartidos = ganados + empatados + perdidos;
			
			resultadoDelPartido = JOptionPane.showInputDialog("Ingrese el resultado del partido");
		}
		System.out.println("Cantidad de partidos ganados: " + ganados);
		System.out.println("Cantidad de partidos empatados: " + empatados);
		System.out.println("Cantidad de partidos perdidos: " + perdidos);
		System.out.println("Puntos total del equipo: " + totalPuntos);
		System.out.println("Porcentaje de partidos ganados: " + (ganados  * 100 / totalPartidos));
		System.out.println("Porcentaje de partidos empatados: " + (empatados * 100 / totalPartidos));
		System.out.println("Porcentaje de partidos perdidos: " + (perdidos * 100 / totalPartidos));
		
		
		
	}

}
