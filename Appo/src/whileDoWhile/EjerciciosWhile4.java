package whileDoWhile;


import javax.swing.JOptionPane;
public class EjerciciosWhile4 {

	public static void main(String[] args) {


		String nombre, tipoCliente;
		double cantidadKV, importe, cantidadFactura = 0, kwConsumidos = 0, totalFacturado = 0;
		
		nombre = JOptionPane.showInputDialog("Ingrese el nombre de cliente");
		
		
		tipoCliente = JOptionPane.showInputDialog("Ingrese el tipo de cliente");			
		
		cantidadKV = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad consumida"));
		
		while(!nombre.equals("*")) {
			
			if(tipoCliente.equalsIgnoreCase("a") || tipoCliente.equalsIgnoreCase("c")) {
				
//				140 o menos $3.20; >140 y < 300 $4, si > 300 $4.5
				
				if(cantidadKV <= 140) {
					
					importe = cantidadKV * 3.2;
				
				}else if (cantidadKV > 140 && cantidadKV < 300){
					
					importe = cantidadKV * 4;
				
				}else {
					
					importe = cantidadKV * 4.5;
				
				}
			}else {
				
//				200 o menos $4.5; si > 200 $5.3
				
				if(cantidadKV <= 200) {
					
					importe = cantidadKV * 4.5;
				}else {
					
					importe = cantidadKV * 5.3;
				}
		}
		nombre = JOptionPane.showInputDialog("Ingrese el nombre de cliente");
		
		
		cantidadFactura++;
		kwConsumidos = kwConsumidos + cantidadKV;
		totalFacturado = totalFacturado + importe;
		
		
		
	}
		System.out.println("La cantidad de facturas son:" + cantidadFactura);
		System.out.println("El total facturado es :" + totalFacturado);
		System.out.println("La cantidad kw consumidos son:" + kwConsumidos);
	}
}
