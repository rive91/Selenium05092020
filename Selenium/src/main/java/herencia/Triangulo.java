package herencia;

public class Triangulo extends DosDimensiones{
	String estilo;
	
	double area() {
		return base*altura/2; //aqui se accede a la variables de la clase padre(superclase)
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es: " + estilo);
	}

}
