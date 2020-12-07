package informationsystem;

public class lesson {
	private String lessonName;
	private String lessoncode;
	private int credit;
	private String day;
	private String starttime;
	private String  finishtime;
	private int note;
	public lesson(String lessonName, String lessoncode, int credit, String day, String starttime, String finishtime,
			int note) {
		super();
		this.lessonName = lessonName;
		this.lessoncode = lessoncode;
		this.credit = credit;
		this.day = day; 
		this.starttime = starttime;
		this.finishtime = finishtime;
		this.note = note;
	}
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public String getLessoncode() {
		return lessoncode;
	}
	public void setLessoncode(String lessoncode) {
		this.lessoncode = lessoncode;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getFinishtime() {
		return finishtime;
	}
	public void setFinishtime(String finishtime) {
		this.finishtime = finishtime;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public void print() {
		System.out.println("DERS ÝSMÝ:"+this.lessonName);
		System.out.println("DERSÝN KODU:"+this.lessoncode);
		System.out.println("DERSÝN KREDÝSÝ:"+this.credit);
		System.out.println("DERS BAÞLAMA SAATÝ:"+ this.starttime);
		System.out.println("DERS BÝTÝÞ SAATÝ:"+this.finishtime);
		System.out.println("DERS NOTU:"+this.note);
	}
	
}
