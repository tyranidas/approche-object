package salaire;

public abstract class Intervenant {
	String nom;
	String prenom;
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public abstract double getSalaire();
	public abstract String getType();
	
	
	public  String afficherDonnees()
	{
		return "Nom : "+this.nom+" | Prénom : "+this.prenom+" | Salaire : "+getSalaire()+" | statut : "+getType();
	}
}
