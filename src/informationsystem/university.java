package informationsystem;

public class university {
	private String üniname;
	private teacher[] danýsman;
	private int[] kredi;
	
	
	public university(String üniname, teacher[] danýsman, int[] kredi) {
		super();
		this.üniname = üniname;
		this.danýsman = danýsman;
		this.kredi = kredi;
	
	}

	public String getÜniname() {
		return üniname;
	}

	public void setÜniname(String üniname) {
		this.üniname = üniname;
	}

	public teacher[] getDanýsman() {
		return danýsman;
	}

	public void setDanýsman(teacher[] danýsman) {
		this.danýsman = danýsman;
	}

	public int[] getKredi() {
		return kredi;
	}

	public void setKredi(int[] kredi) {
		this.kredi = kredi;
	}
	

	public void print () {
		System.out.println("ÜNÝVERSÝTE ADI:"+ this.üniname);
		
		
	}

	
	}

