package perfect.project;

public class Airtel implements sim {

	private String dataStrength;

	public void typeofsim() {
		System.out.println("Airtel");
	}

	public void dtatypesim() {
		System.out.println("4g");
	}

	public String getDataStrength() {
		return dataStrength;
	}

	public void setDataStrength(String dataStrength) {
		this.dataStrength = dataStrength;
	}

}
