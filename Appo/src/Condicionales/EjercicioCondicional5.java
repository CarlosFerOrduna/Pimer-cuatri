package Condicionales;
import javax.swing.JOptionPane;

public class EjercicioCondicional5 {

	public static void main(String[] args) {
		
		//Hacer un programa en el cual el usuario contesta 3 preguntas y el programa calcule
		//cu�ntas de esas 3 preguntas fueron correctas. La preguntas que se deben hacer son:
		//a) �Cu�l es la ra�z cuadrada de 144? (Respuesta: 12)
		//b) �Qui�n fund� Bs As? (Respuesta: Pedro de Mendoza)
		//c) �Cu�l es la capital de Francia? (Paris)
		
	int respuestaA, cantidadRespuestasCorrectas;
	String respuestaB, respuestaC;
	
	respuestaA = Integer.parseInt(JOptionPane.showInputDialog("�Cu�l es la ra�z cuadrada de 144?"));
	respuestaB = JOptionPane.showInputDialog("�Qui�n fund� Bs As?");
	respuestaC = JOptionPane.showInputDialog("�Cual es la capital de Francia?");
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
		
		
		

	