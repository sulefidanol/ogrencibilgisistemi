package informationsystem;

public class student {
	private String name;
	private String surname;
	private int number;
	private double gradeAverage;
	private lesson[] syllabus;
	private int semester;
	private lesson[] transcript;
	private int credit;

	public student(String name, String surname, int number, double gradeAverage, lesson[] syllabus, int semester,
			lesson[] transcript, int credit) {
		super();
		this.name = name;
		this.surname = surname;
		this.number = number;
		this.gradeAverage = gradeAverage;
		this.syllabus = syllabus;
		this.semester = semester;
		this.transcript = transcript;
		this.credit = credit;

	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public lesson[] getTranscript() {
		return transcript;
	}

	public void setTranscript(lesson[] transcript) {
		this.transcript = transcript;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getGradeAverage() {
		return gradeAverage;
	}

	public void setGradeAverage(double gradeAverage) {
		this.gradeAverage = gradeAverage;
	}

	public lesson[] getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(lesson[] syllabus) {
		this.syllabus = syllabus;
	}
   
    
	public void showInfos() {
		System.out.println("Öðrenci Adý ve Soyadý:" + this.name + this.surname);
		System.out.println("Öðrenci Numarasý:" + this.number);
		System.out.println("Öðrencinin Not Ortalamasý:" + this.gradeAverage);
		System.out.println("Öðrenci" + this.credit + "almýþtýr.");
		System.out.println("Öðrencinin Ders Programý:" + syllabus);
		System.out.println("Öðrencinin Transcripti:" + transcript);
		System.out.println("Öðrenci" + this.semester + ".Yarýyýldadýr.");
	
	
		}
}
