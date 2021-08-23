package CondicionalesaAnidados;

import javax.swing.JOptionPane;

public class CondicionalAnidado6 {

	public static void main(String[] args) {
		//			Dados los lados de un triángulo determinar si es:
			//			- Equilátero (los tres lados iguales)
				//		- Isósceles (dos lados iguales)
					//	- Escaleno (ningún lado igual)
		
		
		double ladoA, ladoB, ladoC;
		
		ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer lado"));
		ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado"));
		ladoC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ultimo lado"));
		
		if (ladoA == ladoB && ladoB == ladoC) {
			JOptionPane.showMessageDialog(null, "El triangulo es equilatero");
		}else if (ladoA != ladoB && ladoB != ladoC) {
			JOptionPane.showMessageDialog(null, "El triangulo es escaleno");
		}else {
			JOptionPane.showMessageDialog(null, "El triangulo es isosceles");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
