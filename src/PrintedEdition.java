package by.epam.tr.les09;

public class PrintedEdition {

	int edition;
	String type;
	String periodicity;

	public PrintedEdition() {

	}

	public PrintedEdition(String type, int edition, String periodicity) { //
		this.edition = edition;
		this.type = type;
		this.periodicity = periodicity;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}

}
