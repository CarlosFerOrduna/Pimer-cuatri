package SegundoParcial;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {

		String nombre, tipoDeCliente;
		int  totalFacturas = 0;
		double KVHConsumidos = 0, totalKV = 0;
		
		nombre = JOptionPane.showInputDialog("Ingrese su nombre");
				
		while(!nombre.equals("/")) {
			
			tipoDeCliente = JOptionPane.showInputDialog("Ingrese tipo de cliente");
			KVHConsumidos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de kv/h consumidos"));
			
			if (tipoDeCliente.equalsIgnoreCase("a") || tipoDeCliente.equalsIgnoreCase("c")) {
				if(KVHConsumidos <= 100 ) {
					totalKV = KVHConsumidos * 3.2;
				}else if(KVHConsumidos > 100 && KVHConsumidos < 300) {
					totalKV = KVHConsumidos *4.3;
				}else if(KVHConsumidos >= 300) {
					totalKV = KVHConsumidos * 4.5;
				}
			}else if(tipoDeCliente.equalsIgnoreCase("b") || tipoDeCliente.equalsIgnoreCase("d")) {
				if(KVHConsumidos <= 90) {
					totalKV = KVHConsumidos * 4.5;
				}else if(KVHConsumidos > 90) {
					totalKV = KVHConsumidos * 5.3;
				}
			}
			
			totalFacturas++;
			totalKV++;
			KVHConsumidos++;
			
			nombre = JOptionPane.showInputDialog("Ingrese su nombre");
			
		}
		System.out.println("La cantidad de facturas realizadas es: " +  totalFacturas);
		System.out.println("El total del monto facturado es: " + totalKV);
		System.out.println("El total de kv/h consumidos es: " + KVHConsumidos);
		
	}

}
