package whileDoWhile;
import javax.swing.JOptionPane;
public class EjerciciosWhile5 {

	public static void main(String[] args) {
//	5) En una universidad se har� un relevamiento entre una cantidad no determinada de
//	alumnos. Se desea obtener
//	a) porcentaje de la poblaci�n femenina
//	b) porcentaje poblaci�n masculina
//	c) mejor promedio cuatrimestral de la poblaci�n femenina
//	d) mejor promedio cuatrimestral de la poblaci�n masculina
//	Los datos que se ingresan son: sexo, promedio, matricula. Para indicar el fin se ingresa un 0
//	como matr�cula
	
	String sexo;
	int promedio, porcentaje, matricula;
	
	matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la matricula"));
	sexo = JOptionPane.showInputDialog("Ingrese el sexo del alumno");
	promedio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el promedio"));
	
	while(matricula!=0) {
		if (sexo.equalsIgnoreCase("Femenino")) {
			
		}else {
			
		}
		
	}
	matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la matricula"));
	sexo = JOptionPane.showInputDialog("Ingrese el sexo del alumno");
	promedio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el promedio"));
	
	
	
	
	
	
	
	

	}	
}
