package Final;
import java.util.Random;
public class Juegos {

	public static void main(String[] args) {
		String[] cuartoTrampa = {"Biombo", "Ahoracado", "Otro", "Otro2"};
		String[] posiblePremio = {"Botella de agua", "Chebuzan de milanga", "Martillo", "Capa de harry"};
		System.out.println(cuartoTrampa[juegos(cuartoTrampa, 0)]);

//		if(juegos(cuartoTrampa,0) == 0) {
//			System.out.println("funciona");
//		}else {
//			System.out.println("no funciona");
//		}
		
		
		
		System.out.println(posiblePremio[cofre(posiblePremio, 0)]);
	}
	public static int juegos(String[]trampas, int posicionTrampas) {
		Random random = new Random();
		
		posicionTrampas = random.nextInt(trampas.length);
		
		if (posicionTrampas == 0) {
			return posicionTrampas;
		}else if(posicionTrampas == 1) {
			return posicionTrampas;
		}else if(posicionTrampas == 2) {
			return posicionTrampas;
		}else {
			return posicionTrampas;
		}
		
		
	}
	public static int cofre(String[] premio, int posicionPremio) {
		Random random = new Random();
		
		posicionPremio = random.nextInt(premio.length);
		
		if(posicionPremio == 0) {
			return posicionPremio;
		}else if (posicionPremio == 1) {
			return posicionPremio;
		}else if (posicionPremio == 2) {
			return posicionPremio;
		}else {
			return posicionPremio;
		}
	}
}
