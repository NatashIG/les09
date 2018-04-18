package by.epam.tr.les09;

public class Book extends PrintedEdition {
	private String subject;

	public Book(String type, int edition, String periodicity, String subject) { //
		setEdition(edition);
		setType(type);
		setPeriodicity(periodicity);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		return "edition,copies - " + edition + " , type - " + type + " , periodicity - " + periodicity + " , SUBJECT - " + subject;
	}

}
