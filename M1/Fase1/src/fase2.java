
public class fase2 {

	public static void main(String[] args) {
		
		int anyTraspas1 = 1948;
		int anyNeixament = 1996;
		int cadaQuan = 4;
		int quantsAnys = 0;
		
		for (int i = anyTraspas1; i <= anyNeixament; i = i + cadaQuan ) {
			quantsAnys++;
		}
		
		System.out.println(quantsAnys);
	}

}
