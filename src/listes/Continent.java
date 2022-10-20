package listes;

public enum Continent {
	AFRIQUE ("Afrique"),
	AMERIQUE ("Amérique"),
	ASIE ("Asie"),
	EUROPE ("Europe"),
	OCEANIE ("Océanie");
	
	private String libellé;

	public static Continent ofLibelle(String test) {
		Continent[] continents = Continent.values();
		for (Continent c: continents)
		{
			if (c.getLibellé().equals(test))
			{
			return c;
			}
		}
		return null;
	}
	
	
	private Continent(String libellé) {
		this.libellé = libellé;
	}

	public String getLibellé() {
		return libellé;
	}

	public void setLibellé(String libellé) {
		this.libellé = libellé;
	}
	
	
}
