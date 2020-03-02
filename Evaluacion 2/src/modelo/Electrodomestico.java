package modelo;

public class Electrodomestico {
	
	/**Atributos de electrodomestico**/
	protected int precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;
	
    /**Constante de precio, color, consumo, peso**/
    protected final static int precioConst = 100000;
    protected final static String colorConst = "blanco";
    protected final static char consumoEnergeticoConst = 'F';
    protected final static int pesoConst = 5;
    
    /** Constructor por defecto**/
    public Electrodomestico() {
    	this(precioConst, pesoConst, consumoEnergeticoConst, colorConst);
		
	}
	
    /**Constructor de parametro precioBase y peso**/
    public Electrodomestico(int precioBase, int peso){
        this(precioBase, peso, consumoEnergeticoConst, colorConst);
    }
   
    /**Constructor de parametros precioBase, peso, consumoEnergetico, color**/
    public Electrodomestico(int precioBase, int peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        ComprobarConsumoEnergetico(consumoEnergetico);
        ComprobarColor(color);
	}
	/**Creamos metodo get de precioBase**/
	public int getPrecioBase() {
		return precioBase;
	}
	/**Creamos metodo get de color**/
	public String getColor() {
		return color;
	}
	/**Creamos metodo get de consumoEneregetico**/
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	/**Creamos metodo get de color**/
	public int getPeso() {
		return peso;

	}	
	/**Metodo para escoger el consumo energetico**/
	public void ComprobarConsumoEnergetico(char consumoEnergetico) {
		 if(consumoEnergetico>=65 && consumoEnergetico<=70){
	            this.consumoEnergetico=consumoEnergetico;
	        }else{
	            this.consumoEnergetico=consumoEnergeticoConst;
	        }
	}
	/**Metodo para escoger el color que desea**/
	public void ComprobarColor(String color) { 
		if(color == "Negro" || color == "Azul"|| color == "Gris" || color == "Rojo") {
		this.color = color;
			} else {
				this.color = "Blanco";}
		
	}	
	/**Metodo para calcular precio final**/ 
	public int PrecioFinal() {
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

	

        
  


