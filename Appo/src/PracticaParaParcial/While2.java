package PracticaParaParcial;

import javax.swing.JOptionPane;

public class While2 {

	public static void main(String[] args) {

//	2) Dados pares de n�meros se pide calcular el promedio de ellos, el programa termina
//	cuando el usuario responde �no� a la pregunta �desea calcular otro par?

		double numero1, numero2, promedio;
		String pregunta;
		
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numeros"));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));

		promedio = (numero1 + numero2) / 2;

		JOptionPane.showMessageDialog(null, "El resultado es: " + promedio);
		
			pregunta = JOptionPane.showInputDialog("Desea ingresar un nuevo par de numeros");
		
		while (!pregunta.equalsIgnoreCase("no")) {
		
			numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numeros"));
			numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));

			promedio = (numero1 + numero2) / 2;

			JOptionPane.showMessageDialog(null, "El resultado es: " + promedio);
			
			pregunta = JOptionPane.showInputDialog("Desea ingresar un nuevo par de numeros");
		}
			
	}

}
