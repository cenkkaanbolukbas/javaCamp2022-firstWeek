package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1= "Züleyha";
		String ogrenci2= "Cenk";
		String ogrenci3= "Kaan";
		String ogrenci4= "Ersin";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("--------------------");
		
		String[] ogrenciler=new String[4];
		ogrenciler[0]="Züleyha";
		ogrenciler[1]="Cenk";
		ogrenciler[2]="Kaan";
		ogrenciler[3]="Ersin";
		
		for(int i=0; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenci:ogrenciler)
			System.out.println(ogrenci);

	}

}
