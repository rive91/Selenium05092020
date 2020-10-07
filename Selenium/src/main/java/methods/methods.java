package methods;

public class methods {

	public static void main(String[] args) {
		int resultado = suma(3,4);
		System.out.println(resultado);
		
		int resultado2 = suma(3,4,5);
		System.out.println(resultado2);

		int resultado3 = suma(2,4,5,"cadena");
		System.out.println(resultado3);
		
		String marca = carro(1);
		System.out.println(marca);
	}
	
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	//Metodo overload/sobrecarga
	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	public static int suma(int a, int b, int c, String cadena) {
		int d = a + b + c;
		System.out.println(cadena);
		return d;
	}
	
	public static String carro(int a) {
		String[] cars = {"volvo", "BMW","Ford", "Mazda"};
		return cars[a];
	}

}
