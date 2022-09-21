package loopDemo;

public class Main {

	public static void main(String[] args) {
		//for
		// i+1=i++
		// i=i+2=i+=2
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
			
		}
		System.out.println("For döngüsü bitti");
		
		
		//While
		int i= 1;
		while(i<10) {
			System.out.println(i);
			i+=2;
			
		}
		
//infinite loop	
		System.out.println("While Döngüsü Bitti");
		
		// Do-While
		int j=100;
		do{
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti");
		// do-while döngü çalışmadığında bir kere çalışır, satırını tamamlar, eğer döngü çalışırsa whiledan bir farkı yoktur.
	}

}
