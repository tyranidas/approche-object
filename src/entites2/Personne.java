package entites2;

import entites.AdressePostale;

public class Personne {

	
		public String nom;
		public String prénom;
		public AdressePostale adresse;
		
		public Personne (String nvNom, String nvPrenom, AdressePostale nvAdresse)
		{
			this.nom = nvNom;
			this.prénom = nvPrenom;
			this.adresse = nvAdresse;
		}
	
		public String majName (String nvNom)
		{
			String upperNom = nvNom.toUpperCase()+" "+prénom;
			return upperNom;
		}
		
		public void setName (String nvNom)
		{
			nom = nvNom;
		}
		public String getName ()
		{
			return nom;
		}
		
		public void setFirstName (String nvPrénom)
		{
			prénom = nvPrénom;
			
		}
		public String getFirstName ()
		{
			return prénom;
		}
		public void setAdresse (int nvNumero, String nvRue, int nvCodePostal, String nvVille)
		{
			adresse.numeroDeRue = nvNumero;
			adresse.libelléDeRue = nvRue;
			adresse.codePostal = nvCodePostal;
			adresse.ville = nvVille;
		}
		public AdressePostale getAdresse ()
		{
			return adresse;
		}
		
}

