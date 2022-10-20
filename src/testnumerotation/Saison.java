package testnumerotation;

public enum Saison {
		PRINTEMPS ("Printemps", 1),
		ETE ("Ete", 2),
		AUTOMNE ("Automne", 3),
		HIVER ("Hiver", 4);
	
	private String libellé;
	private int ordre;
	
	private Saison(String libellé, int ordre) {
		this.libellé = libellé;
		this.ordre = ordre;
	}

	
	public static Saison ofLibelle(String test) {
		Saison[] saisons = Saison.values();
		for (Saison s: saisons)
		{
			if (s.getLibellé().equals(test))
			{
			return s;
			}
		}
		return null;
		
				
		
		
	}
	
	public String toString()
	{
		return "La saison est "+getLibellé();
	}
	
	public String getLibellé() {
		return libellé;
	}

	public void setLibellé(String libellé) {
		this.libellé = libellé;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	
	
	
}
