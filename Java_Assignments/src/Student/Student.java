package Student;

public class Student {
	private int sid;
	private String sname;
	private int m1, m2, m3;

	public Student() {
		System.out.println("Default comstructor");
	}

	public Student(int id, String sname, int m1, int m2, int m3) {
		this.sid = id;
		this.sname = sname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public void setSid(int no) {
		this.sid = no;
	}

	public int getSid() {
		return this.sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSname() {
		return this.sname;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public String toString() {
		return "Student Id " + this.sid + " Student name " + this.sname + " M1="
	             + this.m1 + " M2=" + this.m2 + " M3="+ this.m3;
	}

}
