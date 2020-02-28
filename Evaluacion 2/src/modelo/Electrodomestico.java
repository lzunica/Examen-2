package modelo;

public class Electrodomestico {
	
	//Atributos de electrodomestico
	private int precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;
	//private Object Electrodomestico();
	
    //Constante de precio, color, consumo, peso
    protected final static int precioConst = 100000;
    protected final static String colorConst = "blanco";
    protected final static char consumoEnergeticoConst = 'F';
    protected final static int pesoConst = 5;
    
	public Electrodomestico() {
		super();
		
	}
	
	Electrodomestico(int precio, int peso) {
		super();
		this.peso = peso;
		this.precioBase = precioBase;	
	}
	
	Electrodomestico(int precioBase, int peso, String color, char consumoEnergetico) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;

	}	
	//Metodo para escoger el consumo energetico
	public void ComprobarConsumoEnergetico(char consumoEnergetico) {
		 if(consumoEnergetico>=65 && consumoEnergetico<=70){
	            this.consumoEnergetico=consumoEnergetico;
	        }else{
	            this.consumoEnergetico=consumoEnergeticoConst;
	        }
	}
	//Metodo para escoger el color
	public void ComprobarColor(String color) { 
		if(color == "Negro" || color == "Azul"|| color == "Gris" || color == "Rojo") {
		this.color = color;
			} else {
				this.color = "Blanco";}
		
	}	
	
	public int PrecioFinal(int precioBase) {
		int monto = 0;
		if (consumoEnergetico=='A') {
            monto += 100;
        } else if (consumoEnergetico=='B') {
            monto += 80;
        } else if (consumoEnergetico=='C') {
            monto += 60;
        } else if (consumoEnergetico=='D') {
            monto += 50;
        }else if (consumoEnergetico=='E') {
            monto += 30;
        }else
            monto += 10;
			
	
		if (peso >= 0 && peso <= 19) {
			monto += 10;
		} else if (peso == 20 && peso <= 49) {
			monto += 50;
		} else if (peso == 50 && peso <= 79) {
			monto += 80;
		}else if (peso > 79) {
			monto += 100;
		}
		return precioBase + monto;
		
	}
	public void muestra() {
	}
}
	

        
  


