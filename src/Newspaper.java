package by.epam.tr.les09;

public class Newspaper extends PrintedEdition {
	private String level;

	public Newspaper(String type, int edition, String periodicity, String level) { //
		setEdition(edition);
		setType(type);
		setPeriodicity(periodicity);
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

	@Override
	public String toString() {
		return "edition,copies - " + edition + " , type - " + type + " , periodicity - " + periodicity + " , LEVEL - "	+ level;
	}
}
