public class Student {
	int sId;
	String sName;
	String deptName;
	int totCredits;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getTotCredits() {
		return totCredits;
	}

	public void setTotCredits(int totCredits) {
		this.totCredits = totCredits;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", deptName="
				+ deptName + ", totCredits=" + totCredits + "]";
	}

	public Student(int sId, String sName, String deptName, int totCredits) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.deptName = deptName;
		this.totCredits = totCredits;
	}

}
