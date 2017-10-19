
public class Main {

	public static void main(String[] args) {

		CuentaBancaria numero1=new CuentaBancaria(23434234,500,50,50);
		
		//Imprimo información usando el metodo toString
		System.out.println(numero1.toString());
		//Imprimo el saldo restante llamando al metodo retirarFondos
		numero1.retirarFondos();
		numero1.ingresarFondos();
		
		
		

	}

}
