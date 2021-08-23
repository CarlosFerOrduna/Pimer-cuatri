package Condicionales;
import javax.swing.JOptionPane;

public class EjercicioCondicional5 {

	public static void main(String[] args) {
		
		//Hacer un programa en el cual el usuario contesta 3 preguntas y el programa calcule
		//cuántas de esas 3 preguntas fueron correctas. La preguntas que se deben hacer son:
		//a) ¿Cuál es la raíz cuadrada de 144? (Respuesta: 12)
		//b) ¿Quién fundó Bs As? (Respuesta: Pedro de Mendoza)
		//c) ¿Cuál es la capital de Francia? (Paris)
		
	int respuestaA, cantidadRespuestasCorrectas;
	String respuestaB, respuestaC;
	
	respuestaA = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la raíz cuadrada de 144?"));
	respuestaB = JOptionPane.showInputDialog("¿Quién fundó Bs As?");
	respuestaC = JOptionPane.showInputDialog("¿Cual es la capital de Francia?");
	cantidadRespuestasCorrectas = 0;
	if (respuestaA == 12) {
		cantidadRespuestasCorrectas++;
		}
	
	if (respuestaB.equalsIgnoreCase ("Pedro")) {
		cantidadRespuestasCorrectas++;
		
	    }
	if (respuestaC.equalsIgnoreCase ("Paris")) {
		cantidadRespuestasCorrectas++;
		
	
	    }
	JOptionPane.showMessageDialog(null, "La cantidad de respuestas correctas es " + cantidadRespuestasCorrectas);

	}
	
	
	
	
		
	}
		
		
		

	