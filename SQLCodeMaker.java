package sqlTypeWriter;

public class SQLCodeMaker {
	private String databaseWanted;
	private String selectWanted;
	private String fromWanted;
	
	
	public String getDatabaseWanted() {
		return databaseWanted;
	}
	public void setDatabaseWanted(String databaseWanted) {
		this.databaseWanted = databaseWanted;
	}
	public String getSelectWanted() {
		return selectWanted;
	}
	public void setSelectWanted(String selectWanted) {
		this.selectWanted = selectWanted;
	}
	public String getFromWanted() {
		return fromWanted;
	}
	public void setFromWanted(String fromWanted) {
		this.fromWanted = fromWanted;
	}

	
	public SQLCodeMaker (String databaseWanted, String selectWanted, String fromWanted) {
		this.databaseWanted = databaseWanted;
		this.selectWanted = selectWanted;
		this.fromWanted = fromWanted;
		
		
	}
	public String toString() {
		return "\nTypewriter has created SQL code: " +"\n\nUSE "+databaseWanted +"\nSELECT "+selectWanted +"\nFROM "+fromWanted;
	}
	

}
