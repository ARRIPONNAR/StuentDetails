package student;

public class SecondaryData {

	public SecondaryData() {
		// TODO Auto-generated constructor stub
	}

	private String number;
	private String addess;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddess() {
		return addess;
	}

	public void setAddess(String addess) {
		this.addess = addess;
	}

	@Override
	public String toString() {
		return "SecondaryData [number=" + number + ", addess=" + addess + "]";
	}

}

