package encapsulamiento;

public class accesoEncap {

	public static void main(String[] args) {
		encap en = new encap();
		
		en.setTipo(5);
		
		System.out.print("El tipo contiene: " + en.getTipo() );
	}

}
