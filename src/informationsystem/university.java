package informationsystem;

public class university {
	private String �niname;
	private teacher[] dan�sman;
	private int[] kredi;
	
	
	public university(String �niname, teacher[] dan�sman, int[] kredi) {
		super();
		this.�niname = �niname;
		this.dan�sman = dan�sman;
		this.kredi = kredi;
	
	}

	public String get�niname() {
		return �niname;
	}

	public void set�niname(String �niname) {
		this.�niname = �niname;
	}

	public teacher[] getDan�sman() {
		return dan�sman;
	}

	public void setDan�sman(teacher[] dan�sman) {
		this.dan�sman = dan�sman;
	}

	public int[] getKredi() {
		return kredi;
	}

	public void setKredi(int[] kredi) {
		this.kredi = kredi;
	}
	

	public void print () {
		System.out.println("�N�VERS�TE ADI:"+ this.�niname);
		
		
	}

	
	}

