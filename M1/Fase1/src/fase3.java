
public class fase3 {

	public static void main(String[] args) {
		
		int anyTraspas1 = 1948;
		int anyNeixament = 1996;
		int cadaQuan = 4;
		boolean bool = false;
		
		for (int i = anyTraspas1; i <= anyNeixament; i = i + cadaQuan ) {
			System.out.println(i);
			if (i == anyNeixament) {
				bool = true;
			}
		}
		
		if (bool) {
			System.out.println("El meu any de neixament " + anyNeixament + " va ser de traspás!!!");
		} else {
			System.out.println("El meu any de neixament " + anyNeixament + " no va ser de traspás... ;(");
		}

	}

}
