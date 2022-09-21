package switchDemo;

public class Main {

	public static void main(String[] args) {
	  char grade ='C';
	  
	  switch(grade) {
	  case'B':
		  System.out.println("İyi: Başardınız");
		  break;
	  case 'C':
		  System.out.println("Orta: Başardınız");
		  break;
	  case 'D':
		  System.out.println("Kıl payı: Başardınız");
		  break;
	  case 'F':
		  System.out.println("Üzgünüm: Kaldınız");
		  break;
	  default:
			  System.out.println("Geçersiz not");
	  }
		

	}

}
