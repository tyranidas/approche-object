package entites;

public class AdressePostale {

	public int numeroDeRue;
	public String libelléDeRue;
	public int codePostal;
	public String ville;
	
	public AdressePostale() {
		
	}
	
	public AdressePostale(int NvnumeroDeRue, String NvLibelléDeRue,	int NvCodePostal, String nvVille)
	{
		numeroDeRue = NvnumeroDeRue;
		libelléDeRue = NvLibelléDeRue;
		codePostal	= NvCodePostal;
		ville = nvVille;
	}

}


