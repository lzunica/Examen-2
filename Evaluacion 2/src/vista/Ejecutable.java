package vista;

import modelo.Electrodomestico;
import modelo.Lavadora;
import modelo.Television;

public class Ejecutable {

	public static void main(String[] args) {

	    /**Creamos array de 10 posiciones y creamos electrodomesticos, lavadores y televisores**/
		Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];  
        
        listaElectrodomesticos[0]=new Electrodomestico(130, 46, 'D', "Gris");
        listaElectrodomesticos[1]=new Lavadora(200, 23, 'E', "Verde", 60);
        listaElectrodomesticos[2]=new Lavadora(156, 80, 'A', "Negro", 80);
        listaElectrodomesticos[3]=new Electrodomestico(400, 60, 'C', "Azul");
        listaElectrodomesticos[4]=new Electrodomestico(600, 35, 'A', "Gris");
        listaElectrodomesticos[5]=new Lavadora(300, 40, 'Z', "Blanco", 40);
        listaElectrodomesticos[6]=new Television(250, 70);
        listaElectrodomesticos[7]=new Lavadora(400, 100, 'A', "Rojo", 15);
        listaElectrodomesticos[8]=new Television(203, 60, 'B', "Negro", 67, true);
        listaElectrodomesticos[9]=new Electrodomestico(500, 25);
	/**Creamos variables para ir sumando precio de cada producto**/
	int sumaElectrodomesticos=0;
    int sumaTelevisiones=0;
    int sumaLavadoras=0;
    
    /**Recorremos el array y damos valores finales a PrecioFinal**/
    for(int i=0;i<listaElectrodomesticos.length;i++){
        

        if(listaElectrodomesticos[i] instanceof Electrodomestico){
            sumaElectrodomesticos+=listaElectrodomesticos[i].PrecioFinal();
        }
        if(listaElectrodomesticos[i] instanceof Lavadora){
            sumaLavadoras+=listaElectrodomesticos[i].PrecioFinal();
        }
        if(listaElectrodomesticos[i] instanceof Television){
            sumaTelevisiones+=listaElectrodomesticos[i].PrecioFinal();
        }
    
    }    
    /**Damos por pantalla los resultado de precio final**/
    System.out.println("Usted debe cancelar por:");
    System.out.println("Electrodomesticos: "+sumaElectrodomesticos);
    System.out.println("Lavadoras: "+sumaLavadoras);
    System.out.println("Televisiones: "+sumaTelevisiones);
	}
}

