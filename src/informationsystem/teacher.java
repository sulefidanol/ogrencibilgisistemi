package informationsystem;

public class teacher {

	private String teacherName;
	private String teacherSurname;
	private String kullanıcıAdı;
	private int parola;
	private student[] students;

	public teacher(String teacherName, String teacherSurname, int parola, String kullanıcıAdı, student[] students) {
		super();
		this.teacherName = teacherName;
		this.teacherSurname = teacherSurname;
		this.parola = parola;
		this.kullanıcıAdı = kullanıcıAdı;
		this.students = students;

	}

	public String getKullanıcıAdı() {
		return kullanıcıAdı;
	}

	public void setKullanıcıAdı(String kullanıcıAdı) {
		this.kullanıcıAdı = kullanıcıAdı;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherSurname() {
		return teacherSurname;
	}

	public void setTeacherSurname(String teacherSurname) {
		this.teacherSurname = teacherSurname;
	}

	public int getParola() {
		return parola;
	}

	public void setParola(int parola) {
		this.parola = parola;
	}

	public student[] getStudents() {
		return students;
	}

	public void setStudents(student[] students) {
		this.students = students;
	}

	public void print() {
		System.out.println("DANIŞMAN ÖĞRETMEN İSMİ:"+ this.teacherName);
		System.out.println("DANIŞMAN ÖĞRETMEN SOYADI:"+this.teacherSurname);
		System.out.println("DANIŞMAN ÖĞRETMEN PAROLA:"+this.parola);
		System.out.println("DANIŞMAN ÖĞRETMEN KULLANICI ADI:"+ this.kullanıcıAdı);
		System.out.println("DANIMAN HOCANIN ÖĞRENCİLERİ:"+this.students);
	}


	
}