
public class fase4 {

	public static void main(String[] args) {

		String nom = "Saad El Mounsi Chaouki";
		String vaigNeixer = "25/10/1996";
		int anyTraspas1 = 1948;
		int anyNeixament = 1996;
		int cadaQuan = 4;
		boolean bool = false;
		
		for (int i = anyTraspas1; i <= anyNeixament; i = i + cadaQuan ) {
			if (i == anyNeixament) {
				bool = true;
			}
		}
		
		if (bool) {
			System.out.println("El meu nom �s " + nom);
			System.out.println("Vaig n�ixer el " + vaigNeixer);
			System.out.println("El meu any de neixament �s de trasp�s");
		} else {
			System.out.println("El meu nom �s " + nom);
			System.out.println("Vaig n�ixer el " + vaigNeixer);
			System.out.println("El meu any de neixament no �s de trasp�s");
		}

	}

}
