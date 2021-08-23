package CondicionalesaAnidados;

import javax.swing.JOptionPane;

public class CondicionalesAnidados5 {

	public static void main(String[] args) {
		//Un postulante a un empleo realizó un test de capacitación y del test se obtuvo la siguiente
		//información: cantidad total de preguntas que se le realizaron y la cantidad de preguntas que
		//contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por
		//teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha
		//obtenido, y sabiendo que:
		//Nivel máximo: Porcentaje >= 90%
		//Nivel medio: Porcentaje >=75% y < 90%
		//Nivel regular: Porcentaje >= 50% y < 75%
		//Fuera de nivel: Porcentaje < 50%
	
		
		double preguntasRealizadas, preguntasCorrectas, porcentaje;
		String categoria;
		
		preguntasRealizadas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de preguntas realizadas"));
		preguntasCorrectas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de preguntas correctas"));
		
		porcentaje = preguntasCorrectas * 100 / preguntasRealizadas;
		
		if(porcentaje >= 90.0) {
			categoria = "en categoria maxima";
		}else if (porcentaje >= 75.0 && porcentaje < 90.0) {
			categoria = "en categoria media";
		}else if (porcentaje >= 50.0 && porcentaje <75.0) {
			categoria = "en categoria regular";
		}else 
			categoria = "fuera de nivel";
		
		JOptionPane.showMessageDialog(null, "Usted esta " + categoria);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
