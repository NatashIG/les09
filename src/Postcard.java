package by.epam.tr.les09;

public class Postcard extends PrintedEdition {
	private String pcTheme;

	public Postcard(String type, int edition, String periodicity, String pcTheme) {
		setEdition(edition);
		setType(type);
		setPeriodicity(periodicity);
		this.pcTheme = pcTheme;
	}

	public String getPcTheme() {
		return pcTheme;
	}

	@Override
	public String toString() {
		return "edition,copies - " + edition + " , type - " + type + " , periodicity - " + periodicity + " , THEME - "	+ pcTheme;
	}
}
