package informationsystem;

public class teacher {

	private String teacherName;
	private String teacherSurname;
	private String kullanýcýAdý;
	private int parola;
	private student[] students;

	public teacher(String teacherName, String teacherSurname, int parola, String kullanýcýAdý, student[] students) {
		super();
		this.teacherName = teacherName;
		this.teacherSurname = teacherSurname;
		this.parola = parola;
		this.kullanýcýAdý = kullanýcýAdý;
		this.students = students;

	}

	public String getKullanýcýAdý() {
		return kullanýcýAdý;
	}

	public void setKullanýcýAdý(String kullanýcýAdý) {
		this.kullanýcýAdý = kullanýcýAdý;
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
		System.out.println("DANIÞMAN ÖÐRETMEN ÝSMÝ:"+ this.teacherName);
		System.out.println("DANIÞMAN ÖÐRETMEN SOYADI:"+this.teacherSurname);
		System.out.println("DANIÞMAN ÖÐRETMEN PAROLA:"+this.parola);
		System.out.println("DANIÞMAN ÖÐRETMEN KULLANICI ADI:"+ this.kullanýcýAdý);
		System.out.println("DANIMAN HOCANIN ÖÐRENCÝLERÝ:"+this.students);
	}


	
}