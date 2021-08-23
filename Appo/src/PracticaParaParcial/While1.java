package PracticaParaParcial;

import javax.swing.JOptionPane;

public class While1 {

	public static void main(String[] args) {
		
//	1) Se tiene la nota de un grupo de estudiantes. Se pide determinar cuántos aprobaron
//	(nota> 4), de estos cuantos deben presentar tp (nota >= 7) y cuantos rinden escrito (nota
//	<7) y cuantos desaprobaron Para finalizar se ingresar una nota negativa
		
		int notas, aprovado = 0, presentarTP = 0, rindenEscrito = 0, desaprovados = 0;
		
		notas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));
		while (notas > 0) {
			if(notas > 4) {
				aprovado++;
				if(notas >= 7) {
				presentarTP++;
			}else if(notas < 7) {
				rindenEscrito++;
			}else {
				desaprovados++;
			}
			
			notas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));
		}
		
	}System.out.println("La cantidad de aprovados es: " + aprovado);
	System.out.println("La cantidad que presentan TP son: " + presentarTP);
	System.out.println("La cantidad que rinden escrito son: " + rindenEscrito);
	System.out.println("La cantidad de desaprovados son: " + desaprovados);
	}
}
