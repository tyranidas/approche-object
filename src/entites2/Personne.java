package entites2;

import entites.AdressePostale;

public class Personne {

	
		public String nom;
		public String prénom;
		public AdressePostale adresse;
		
		public Personne (String NvNom, String NvPrenom, AdressePostale NvAdresse)
		{
			nom = NvNom;
			prénom = NvPrenom;
			adresse = NvAdresse;
		}
	

}
