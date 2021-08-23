package whileDoWhile;

import javax.swing.JOptionPane;

public class EjerciciosWhile6 {

	public static void main(String[] args) {
//	6) En una escuela se debe determinar cuales son los alumnos que tienen aptitudes para
//	formar el nuevo equipo de básquet: Se pide imprimir:
//	a) Total de alumnas relevadas
//	b) cantidad de alumnas que tienen aptitudes para formar el equipo: altura >= 1.73 y peso entre 55 y 83 kg
//	c) porcentaje que representa la cantidad anterior con respecto al total de alumnas relevadas
//	d) total de alumnos varones relevadas 
//	e) cantidad de alumnos que tienen aptitudes para formar el equipo: altura >= 1.83 y peso entre 73 y 105 kg 
//	f) porcentaje que representa la cantidad anterior con respecto al total de alumnos varones relevados
//	g) total de alumnos relevados
//	Este programa finalizará con la pregunta ¿ingresa otro registro?

		int alumnas = 0, alumnos = 0, alumnosRelevados = 0, alumnasRelevadas = 0, total = 0;
		String sexo, nuevoIngreso;
		double altura, peso, porcentajeAlumnas = 0, porcentajeAlumnos = 0;

		sexo = JOptionPane.showInputDialog("Ingrese el sexo del alumno: \n Maculino. \n Femenino.");
		altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del alumno"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del alumno"));

		nuevoIngreso = JOptionPane.showInputDialog("¿Ingresa otro registro?");
		while (nuevoIngreso.equalsIgnoreCase("si")) {
			if (sexo.equalsIgnoreCase("femenino")) {
				alumnas = alumnas++;
				if (altura > 1.72 && peso > 56 && peso < 84) {
					alumnasRelevadas = alumnasRelevadas++;
				}
			} else {
				alumnos = alumnos++;
				if (alumnos > 1.82 && peso > 72 && peso < 106) {
					alumnosRelevados = alumnosRelevados++;
				}

			}
			total = alumnas + alumnos;
			porcentajeAlumnas = alumnasRelevadas * 100.0 / alumnas;
			porcentajeAlumnos = alumnosRelevados * 100.0 / alumnos;

			sexo = JOptionPane.showInputDialog("Ingrese el sexo del alumno");
			altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del alumno"));
			peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del alumno"));
			nuevoIngreso = JOptionPane.showInputDialog("¿Ingresa otro registro?");
		}

		System.out.println("a) El total de alumnas es: " + alumnas);
		System.out.println("b) El total de alumnas con aptitudes es: " + alumnasRelevadas);
		System.out.println("c) El porcentaje de alumnas con aptitudes es de: " + porcentajeAlumnas);
		System.out.println("d) El total de alumnos es: " + alumnos);
		System.out.println("e) El total de alumnos con aptitudes es: " + alumnosRelevados);
		System.out.println("f) El porcentaje de alumnos con aptitudes es: " + porcentajeAlumnos);
		System.out.println("g) El total de alumnos es: " + total);

	}

}
