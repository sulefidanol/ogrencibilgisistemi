package informationsystem;

public class teacher {

	private String teacherName;
	private String teacherSurname;
	private String kullan�c�Ad�;
	private int parola;
	private student[] students;

	public teacher(String teacherName, String teacherSurname, int parola, String kullan�c�Ad�, student[] students) {
		super();
		this.teacherName = teacherName;
		this.teacherSurname = teacherSurname;
		this.parola = parola;
		this.kullan�c�Ad� = kullan�c�Ad�;
		this.students = students;

	}

	public String getKullan�c�Ad�() {
		return kullan�c�Ad�;
	}

	public void setKullan�c�Ad�(String kullan�c�Ad�) {
		this.kullan�c�Ad� = kullan�c�Ad�;
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
		System.out.println("DANI�MAN ��RETMEN �SM�:"+ this.teacherName);
		System.out.println("DANI�MAN ��RETMEN SOYADI:"+this.teacherSurname);
		System.out.println("DANI�MAN ��RETMEN PAROLA:"+this.parola);
		System.out.println("DANI�MAN ��RETMEN KULLANICI ADI:"+ this.kullan�c�Ad�);
		System.out.println("DANIMAN HOCANIN ��RENC�LER�:"+this.students);
	}


	
}