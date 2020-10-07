package condicionales;

public class ForIfBreak {

	public static void main(String[] args) {
		for (int i = 0;i < 10; i++) {
			if(i == 2) {
				break;
			}
			System.out.println("i: " + i);
		}
		System.out.println("Ciclo For Completo");
	}

}
