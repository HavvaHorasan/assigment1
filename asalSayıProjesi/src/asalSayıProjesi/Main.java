package asalSayıProjesi;

public class Main {
	//bug

	public static void main(String[] args) {
		int number = -2;
		int remainder = number % 2;
//		System.out.println(remainder);//25'in 2'ye bölümünden kalan değer
		boolean isPrime = true; //asal mı
		if(number==1) {
			System.out.println("sayı asal değildir");
			return;
		}
		
		if(number<1) {
			System.out.println("geçersiz sayı");
		}
		
		for (int i=2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
			
		}
		if(isPrime) {
			System.out.println("sayı asaldır");
		}
		else {
			System.out.println("sayı asal değildir");
		}
			
		}
		
		
				
		
	}


