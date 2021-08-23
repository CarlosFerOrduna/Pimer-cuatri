package For;

import javax.swing.JOptionPane;

public class EjerciciosFor5 {

	public static void main(String[] args) {
//5) Dado el sueldo de n personas, se pide obtener: - la cantidad de desocupados, la
//		cantidad que cobran hasta 500$, la cantidad que cobran entre 500 y 1000, la
//		cantidad entre 1000 y 2000, y los que superan los 2000 - el sueldo máximo y el
//		nombre de la persona de sueldo máximo - total de sueldos pagados

		int cantidadSueldos, valorSueldo, desocupado = 0, hasta500 = 0, entre5001000 = 0, entre10002000 = 0,
				mas2000 = 0, totalSueldos = 0, maximo = 0;
		String nombre = null;

		cantidadSueldos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos "));

		for (int i = 0; i < cantidadSueldos; i++) {

			valorSueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo"));
			nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona que cobra el suldo");
																	
			if (i > 0) {
				maximo = valorSueldo;
			}
			totalSueldos = totalSueldos + valorSueldo;
			if (valorSueldo <= 0) {
				valorSueldo = desocupado++;
			} else if (valorSueldo > 0 && valorSueldo <= 500) {
				valorSueldo = hasta500++;
			} else if (valorSueldo > 500 && valorSueldo <= 1000) {
				valorSueldo = entre5001000++;
			} else if (valorSueldo > 1000 && valorSueldo <= 2000) {
				valorSueldo = entre10002000++;
			} else if (valorSueldo >= 2001) {
				valorSueldo = mas2000++;
			} else {

			}
		}

		System.out.println("El total de desocupados es: " + desocupado);
		System.out.println("El total de personas que cobran menos 500 es: " + hasta500);
		System.out.println("El total de personas que cobran entre 500 y 1000 es: " + entre5001000);
		System.out.println("El total de personas que cobran entre 1000 y 2000 es: " + entre10002000);
		System.out.println("El total de personas que cobran mas de 2000 es: " + mas2000);
		System.out.println("El sueldo maximo es : $" + maximo + " el nombre de la persona es: " + nombre);
		System.out.println("El total de sueldos pagados es: $" + totalSueldos);

	}

}
