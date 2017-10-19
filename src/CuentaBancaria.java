
public class CuentaBancaria {
	//Atributos
	private int iban;
	private int saldo;
	private int cantidadRetirar;
	private int cantidadIngresar;
	
	/**
	 * 
	 * @param iban - es el numero de cuenta incluido el iban
	 * @param saldo - es el saldo actual que hay en la cuenta
	 * @param cantidadRetirar - es la cantidad de dinero que se desea retirar de la cuent
	 * @param cantidadIngresar - es la cantidad de dinero que se desea ingresar en la cuenta
	 */
	//Constructores
	public CuentaBancaria(int iban,int saldo,int cantidadRetirar,int cantidadIngresar) {
		this.iban=iban;
		this.saldo=saldo;
		this.cantidadRetirar=cantidadRetirar;
		this.cantidadIngresar=cantidadIngresar;
	}

	//Métodos 
	//Setters and Getters
	public int isIban() {
		return this.iban;
	}
	
	public void setIban(int ibanNuevo) {
		this.iban=ibanNuevo;
	}
	
	//ToString
	public String toString() {
		String resultado="";
		resultado+="\nIban: "+this.iban;
		resultado+="\nSaldo: "+this.saldo;

		return resultado;
	}
	
	//Retirar Fondos
	public void retirarFondos() {
		
		if (this.saldo>=this.cantidadRetirar)
		{
			this.saldo=this.saldo-this.cantidadRetirar;
			System.out.println("Saldo restante: "+this.saldo);
		}
		else
		{
			System.out.println("Lo siento, no hay saldo suficiente");
		}
		
		
	}
	
	//Ingresar Fondos
	public void ingresarFondos() {
		
		if (this.cantidadIngresar!=1000)
		{
			
			this.saldo=this.saldo+this.cantidadIngresar;
			System.out.println("Saldo después de suma: "+this.saldo);
		}
		else
		{
			System.out.println("Lo siento, pero no se puede ingresar mas de 1000€");
		}
		
	}
	
	
	
		
	
	
	
	
	
}