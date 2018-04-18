package by.epam.tr.les09;

public class Album extends PrintedEdition {
	private String theme;

	public Album(String type, int edition, String periodicity, String theme) { //
		setEdition(edition);
		setType(type);
		setPeriodicity(periodicity);
		this.theme = theme;
	}

	public String getTheme() {
		return theme;
	}

	@Override
	public String toString() {
		return "edition,copies - " + edition + " , type - " + type + " , periodicity - " + periodicity + " , THEME - "	+ theme;
	}
}
