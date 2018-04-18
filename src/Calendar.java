package by.epam.tr.les09;

public class Calendar extends PrintedEdition {
	private String calType;

	public Calendar(String type, int edition, String periodicity, String calType) { //
		setEdition(edition);
		setType(type);
		setPeriodicity(periodicity);
		this.calType = calType;
	}

	public String getCalType() {
		return calType;
	}

	@Override
	public String toString() {
		return "edition,copies - " + edition + " , type - " + type + " , periodicity - " + periodicity	+ " , CALENDAR TYPE - " + calType;
	}
}
