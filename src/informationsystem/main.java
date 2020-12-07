package informationsystem;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		lesson lesson1 = new lesson("MATEMAT�K", "MAT102", 4, "PAZARTES�", "13:30", "15:30", 40);
		lesson lesson2 = new lesson("D�FERANS�YEL DENKLEMLER", "D�F123", 3, "�AR�AMBA", "14:50", "16:20", 60);
		lesson lesson3 = new lesson("F�Z�K1", "FIZ105", 3, "CUMA", "10:00", "14:00", 70);
		lesson lesson4 = new lesson("B�LG�SAYAR PROGRAMLAMA","BIL125",4,"SALI","9:50","14:00",70);

		lesson[] syllabus1 = { lesson1, lesson2 };
		lesson[] transcript1 = { lesson3 };
		student student1 = new student("Aleyna", "�AKIR", 12345678, 3.4, syllabus1, 4, transcript1, 19);

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
		teacher teacher2 = new teacher("Ali", "YILMAZ", 25645, "aliy�lmaz", new student[] { student3 });
		teacher teacher3 = new teacher("Furkan","YILDIZ",986585,"furkany�lmazz",new student[] {student4}); 

		int[] maxkredi = { 19, 19, 18, 18, 17, 19, 14, 14 };
		university gelisimUni = new university("GEL���M �N�VERS�TES�", new teacher[] { teacher1, teacher2,teacher3}, maxkredi);

		Scanner scan = new Scanner(System.in);

		System.out.println("Kullan�c� Ad�n� Girin");
		String kullan�c�Ad� = scan.nextLine();
		System.out.println("Parolay� Giriniz:");
		int parola = scan.nextInt();

		for (int i = 0; i < gelisimUni.getDan�sman().length; i++) {

			if (gelisimUni.getDan�sman()[i].getKullan�c�Ad�().equals(kullan�c�Ad�)
					&& gelisimUni.getDan�sman()[i].getParola() == parola) {

				boolean devamEt = true;
				while (devamEt) {
					System.out.println("G�R�� BA�ARILI");
					System.out.println("HO�GELD�N�Z " + gelisimUni.getDan�sman()[i].getKullan�c�Ad�());
					System.out.println("1- �N�VERS�TE B�LG�S� G�R�NT�LE");
					System.out.println("2- DANI�MAN HOCALARI L�STELE");
					System.out.println("3- ��RENC�LER� L�STELE");
					System.out.println("4- DERSLER� L�STELE");
					System.out.println("0- �IKI�");
					int secim = scan.nextInt();
					if (secim == 1) {
						gelisimUni.print();
					} else if (secim == 2) {
						for(int k=0;k<gelisimUni.getDan�sman().length;k++) {
							gelisimUni.getDan�sman()[k].print();
						}
					} else if (secim == 3) {
						for(int j=0;j<gelisimUni.getDan�sman()[i].getStudents().length;j++) {
							gelisimUni.getDan�sman()[i].getStudents()[j].showInfos();
							
						}
						System.out.println();
					}
					else if (secim==4){
						System.out.println("");
					}
					else {
						devamEt = false;
						System.out.println("G�LE G�LE");
					}
				}
			}

		}
		scan.close();

	}
}
