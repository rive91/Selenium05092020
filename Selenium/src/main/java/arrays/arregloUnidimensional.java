package arrays;

public class arregloUnidimensional {

	public static void main(String[] args) {
		
		//Son declaraciones validas
		int intArray[];
		int[] intArray2;
		
		//tipos de datos
		byte arraybyte[];
		short shortarray[];
		char charArray[];
		
		//declarar array de strings
		String[] arr;
		
		//Asignar memoria para 5 strings
		arr = new String[5];
		
		//Iniciar el primer elemento.
		arr[0] = "rojo";
		
		//sucesivos
		arr[1] = "azul";
		arr[2] = "morado";
		arr[3] = "verde";
		arr[4] = "blanco";
		
		//Accediendo a los elementos del array
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en el indice " + i + ": " + arr[i]);
		}
		
		//Forma simple de declarar un array
		String[] sArray = new String[] {"cero","uno"};
		for(int i = 0; i < sArray.length; i++) {
			System.out.println("Elemento en el indice " + i + ": " + sArray[i]);
		}
		
		//ejemplo int
		int[] intArrayunalinea = new int[] {1,2,3,4};

	}

}
