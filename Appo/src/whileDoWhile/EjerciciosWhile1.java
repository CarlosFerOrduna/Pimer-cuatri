package whileDoWhile;

import javax.swing.JOptionPane;

public class EjerciciosWhile1 {

	public static void main(String[] args) {

//		1) Se tiene la nota de un grupo de estudiantes. Se pide determinar cu�ntos aprobaron
//	(nota> 4), de estos cuantos deben presentar tp (nota >= 7) y cuantos rinden escrito (nota
//	<7) y cuantos desaprobaron Para finalizar se ingresar una nota negativa

		int nota, presentarTP = 0, escrito = 0, desaprobado = 0;

		nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));

		while (nota >= 0) {

			if (nota > 4) {
				// aprovado++;
				if (nota >= 7) {
					presentarTP++;
				} else {
					escrito++;
				}
			} else {
				desaprobado++;
			}
			nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));
		}
		System.out.println("La cantidad de aprobados son: " + (presentarTP + escrito));
		System.out.println("La cantidad que presentan TP son: " + presentarTP);
		System.out.println("La cantidad que rinde escritos es: " + escrito);
		System.out.println("La cantidad de desaprobados es: " + desaprobado);
	}
}
