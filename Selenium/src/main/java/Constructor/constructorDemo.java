package Constructor;

public class constructorDemo {

	public static void main(String[] args) {
		miClase t1 = new miClase(2);
		miClase t2 = new miClase(); //Vuelve a llamar a la misma clase/constructor como ejemplo
		System.out.println(t1.x + " " + t2.x);
	}

}
