import javax.swing.JOptionPane;

public class MostrarMuneco {

	public static void main(String[] args) {
	
		int error, muneco;
		
		String [] pregunta = {"opcion1" , "opcion2", "opcion3", "opcion4", "opcion5" }; 
		
		error = JOptionPane.showOptionDialog(null, "�dice error?", "�lo es?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE
				 , null, pregunta, pregunta[0]);

		muneco = mostrarAhorcado(error);
		
	}
		public static int mostrarAhorcado(int cantidadErrores) {
			
			if (cantidadErrores == 0 ) {
				 
				System.out.println("0");
				
			}else if(cantidadErrores == 1 ){
				System.out.println("-|-");
			}
		else if(cantidadErrores == 2 ){
				System.out.println("| |");
			}
		else if(cantidadErrores == 3 ){
//				bIzquierdo
			}
		else if(cantidadErrores == 4 ){
//				pDerecha
			}
		else {
//			pIzquierda
		}
			return cantidadErrores;
		}
		
		
		
		
		
		
	

}
//int tomasCantimplora = JOptionPane.showOptionDialog(null, mensaje,titulo,JOptionPane.DEFAULT_OPTION, 
//JOptionPane.QUESTION_MESSAGE, null, opciones,opciones[0]);