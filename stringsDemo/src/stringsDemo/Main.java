package stringsDemo;

public class Main {

	public static void main(String[] args) {
		//string=metin=karakter dizisi
		//concat=birleştirmek
		String mesaj="Bugün hava çok güzel.";
		
		System.out.println(mesaj);
		
//		System.out.println("Eleman sayısı:"+mesaj.length());
//		System.out.println("5. eleman:"+mesaj.charAt(4));                (ctrl+shift+/)
//		System.out.println(mesaj.concat("Yaşasın !"));
//		System.out.println(mesaj.startsWith ("B"));
//		System.out.println(mesaj.endsWith("."));
//		char[]karakterler =new char [5];
//		mesaj.getChars(0,5,karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf("av"));
//		System.out.println(mesaj.lastIndexOf("a"));
		String yeniMesaj = mesaj.replace(' ','-');
		
		System.out.println(yeniMesaj);
		// string fonksiyonlarının hemen hemen tamamı ilgili metnin kemdisini değistirmez, yeni bir çıktı üretir.
		System.out.println(mesaj.substring(2,5)); //ikinci indexsinden itibaren parçala, 5'e kadar 5 geçerli değil
		
		for(String kelime: mesaj.split(" ")) {   // split=ayır
			System.out.println(kelime);
			
		}
		
		System.out.println(mesaj.toLowerCase());//küçük harf çevirir (aramalarda kullanılır)
		System.out.println(mesaj.toUpperCase()); //büyük harfe çevirir (aramalarda kullanılır)
//		System.out.println(mesaj.trim()); //başındaki ve sonundaki boşlukları atar
		
		

	}

}
