package informationsystem;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		lesson lesson1 = new lesson("MATEMATÝK", "MAT102", 4, "PAZARTESÝ", "13:30", "15:30", 40);
		lesson lesson2 = new lesson("DÝFERANSÝYEL DENKLEMLER", "DÝF123", 3, "ÇARÞAMBA", "14:50", "16:20", 60);
		lesson lesson3 = new lesson("FÝZÝK1", "FIZ105", 3, "CUMA", "10:00", "14:00", 70);
		lesson lesson4 = new lesson("BÝLGÝSAYAR PROGRAMLAMA","BIL125",4,"SALI","9:50","14:00",70);

		lesson[] syllabus1 = { lesson1, lesson2 };
		lesson[] transcript1 = { lesson3 };
		student student1 = new student("Aleyna", "ÇAKIR", 12345678, 3.4, syllabus1, 4, transcript1, 19);

		lesson[] syllabus2 = { lesson1 };
		lesson[] transcript2 = { lesson3, lesson2 };
		student student2 = new student("Ali", "ASLAN", 56478965, 2.4, syllabus2, 2, transcript2, 19);

		lesson[] syllabus3 = { lesson1, lesson3, lesson2 };
		lesson[] transcript3 = {};
		student student3 = new student("Mahmut", "TUNCER", 254587522, 3.1, syllabus3, 1, transcript3, 19);
		
		lesson[] syllabus4 = { lesson2, lesson3, lesson4 };
		lesson[] transcript4 = {lesson1};
		student student4 = new student("Selin", "MERT", 866115451, 4.0, syllabus4, 7, transcript4 , 14);
		
		

		teacher teacher1 = new teacher("Mehmet", "AYAZ", 12345, "mehmetayaz", new student[] { student1, student2 });
		teacher teacher2 = new teacher("Ali", "YILMAZ", 25645, "aliyýlmaz", new student[] { student3 });
		teacher teacher3 = new teacher("Furkan","YILDIZ",986585,"furkanyýlmazz",new student[] {student4}); 

		int[] maxkredi = { 19, 19, 18, 18, 17, 19, 14, 14 };
		university gelisimUni = new university("GELÝÞÝM ÜNÝVERSÝTESÝ", new teacher[] { teacher1, teacher2,teacher3}, maxkredi);

		Scanner scan = new Scanner(System.in);

		System.out.println("Kullanýcý Adýný Girin");
		String kullanýcýAdý = scan.nextLine();
		System.out.println("Parolayý Giriniz:");
		int parola = scan.nextInt();

		for (int i = 0; i < gelisimUni.getDanýsman().length; i++) {

			if (gelisimUni.getDanýsman()[i].getKullanýcýAdý().equals(kullanýcýAdý)
					&& gelisimUni.getDanýsman()[i].getParola() == parola) {

				boolean devamEt = true;
				while (devamEt) {
					System.out.println("GÝRÝÞ BAÞARILI");
					System.out.println("HOÞGELDÝNÝZ " + gelisimUni.getDanýsman()[i].getKullanýcýAdý());
					System.out.println("1- ÜNÝVERSÝTE BÝLGÝSÝ GÖRÜNTÜLE");
					System.out.println("2- DANIÞMAN HOCALARI LÝSTELE");
					System.out.println("3- ÖÐRENCÝLERÝ LÝSTELE");
					System.out.println("4- DERSLERÝ LÝSTELE");
					System.out.println("0- ÇIKIÞ");
					int secim = scan.nextInt();
					if (secim == 1) {
						gelisimUni.print();
					} else if (secim == 2) {
						for(int k=0;k<gelisimUni.getDanýsman().length;k++) {
							gelisimUni.getDanýsman()[k].print();
						}
					} else if (secim == 3) {
						for(int j=0;j<gelisimUni.getDanýsman()[i].getStudents().length;j++) {
							gelisimUni.getDanýsman()[i].getStudents()[j].showInfos();
							
						}
						System.out.println();
					}
					else if (secim==4){
						System.out.println("");
					}
					else {
						devamEt = false;
						System.out.println("GÜLE GÜLE");
					}
				}
			}

		}
		scan.close();

	}
}
