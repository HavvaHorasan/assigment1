package sayıBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 10;
		
		boolean varMi = false;
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break; //break döngüyü bitir demek
			}
		}
		if(varMi) {  //true yazmakla varMi yazmak aynı şey
			System.err.println("Sayı mevcuttur");
		}else {
			System.out.println("Sayı mevcut değildir");
		}

	}

}
