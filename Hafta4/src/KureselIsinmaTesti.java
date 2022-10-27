import java.util.Scanner;

public class KureselIsinmaTesti {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
	    System.out.println("Kuresel Isinma Testi");
		System.out.println("Cevaplarinizi buyuk harfle girin.");
	    int dogru=0;
		
		String[] cevaplar = new String[5];
		String[] dogruCevaplar = {"A","B","C","C","C"};
		
		System.out.println("1-Hangi ulke en cok sera gazi yaymaktadir?");
		System.out.println("A-Cin");
		System.out.println("B-Hindistan");
		System.out.println("C-Amerika");
		System.out.println("D-Japonya");
		String cevap1 = input.next();
		cevaplar[0]= cevap1;
		
		System.out.println("2-)Hangi gezegenin atmosferi kuresel isinma ile yok edilmektedir?");
		System.out.println("A-Jupiter ");
		System.out.println("B-Venus ");
		System.out.println("C-Mars");
		System.out.println("D-Merkur ");
		String cevap2 = input.next();
		cevaplar[1]=cevap2;
		
		System.out.println("3-)Hangi tur ampul en az enerjiyi tüketir?");
		System.out.println("A-Akkor Ampul");
		System.out.println("B-Halojen Ampul ");
		System.out.println("C-Kompakt Floresans Ampul ");
		System.out.println("D-Normal Ampul ");
		String cevap3 = input.next();
		cevaplar[2]=cevap3;
		
		System.out.println("4-)Iklim degisikligi nedeniyle yilda kac kisi olmektedir?");
		System.out.println("A-1500 ");
		System.out.println("B-100.000 ");
		System.out.println("C-150.000 ");
		System.out.println("D-500.000 ");
		String cevap4 = input.next();
		cevaplar[3]=cevap4;
		
		System.out.println("5-)Kuresel isinmaya karsi en savunmasiz hayvan hangisidir?");
		System.out.println("A-Kar Leopari");
		System.out.println("B-Kutup Ayisi");
		System.out.println("C-Deniz Gergedani");
		System.out.println("D-Tukan");
		String cevap5 = input.next();
		cevaplar[4]=cevap5;
		
		for(int i=0;i<cevaplar.length;i++) {
			if(cevaplar[i].equals(dogruCevaplar[i])) dogru +=1;
		}
		
		if(dogru==5) System.out.println("Mukemmel");
		else if(dogru==4) System.out.println("Cok iyi");
		else System.out.println("Kuresel isinma bilgilerinizi tazeleme vakti geldi");
		
		for(String cevap : cevaplar) {
			System.out.println(cevap);
		}
		
	}
}
