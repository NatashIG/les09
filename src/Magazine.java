package by.epam.tr.les09;

public class Magazine extends PrintedEdition {
	private String audience;

	public Magazine(String type, int edition, String periodicity, String audience) { //
		setEdition(edition);
		setType(type);
		setPeriodicity(periodicity);
		this.audience = audience;
	}

	public String getAudience() {
		return audience;
	}

	@Override
	public String toString() {
		return "edition,copies - " + edition + " , type - " + type + " , periodicity - " + periodicity	+ " , AUDIENCE - " + audience;
	}
}
