package modelo;

public class Television extends Electrodomestico{
	/**Atributos de Television**/
	private int pulgadas;
	private boolean sintonizador;

    /**Constante de pullgadas y sintonizador**/
	protected final static int pulgadasConst = 20;
	protected final static boolean sintonizadorConst = false;
	
	/** Constructor por defecto**/
	public Television(){
        this(precioConst, pesoConst, consumoEnergeticoConst, colorConst, pulgadasConst, false);
    } 
	/**Constructor de 2 parametro precioBase y peso**/
    public Television(int precioBase, int peso){
        this(precioBase, peso, consumoEnergeticoConst, colorConst, pulgadasConst, false);
    }
    /**Constructor de parametros precioBase, peso, consumoEnergetico, color, pulgadas y sintonizador**/
    public Television(int precioBase, int peso, char consumoEnergetico, String color, int pulgadas, boolean sintonizador){
        super(precioBase, peso, consumoEnergetico, color);
        this.pulgadas=pulgadas;
        this.sintonizador=sintonizador;
    }
    /**Metodo precioFinal de la Television**/
	public int precioFinal(){
        int monto=super.PrecioFinal();
	  	      
	        if (pulgadas>40){
	            monto+=precioBase*0.3;
	        }
	        if (sintonizador){
	            monto+=50;
	        }
	  
	        return monto;
	    }
}
