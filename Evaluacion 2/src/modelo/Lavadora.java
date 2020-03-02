package modelo;

public class Lavadora extends Electrodomestico{
	/**Atributos de Lavadora**/
	private int carga;

    /**Constante de carga constante**/
	protected final static int cargaConst = 5;
	
	/**Creamos metodo get de color**/
	public int getCarga() {
		return carga;
	}
	/** Constructor por defecto**/
	public Lavadora(){
        this(precioConst, pesoConst, consumoEnergeticoConst, colorConst, cargaConst);
    }

    /**Constructor de 2 parametro precioBase y peso**/
    public Lavadora(int precioBase, int peso){
        this(precioBase, peso, consumoEnergeticoConst, colorConst, cargaConst);
    }
    /**Constructor de parametros precioBase, peso, consumoEnergetico, color, carga**/
    public Lavadora(int precioBase, int peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
    /**Metodo precioFinal de la Lavadora**/
	public int precioFinal(){
        int monto=super.PrecioFinal();
	
	if (carga>30){
        monto+=50;
    }

    return monto;
}  
}
