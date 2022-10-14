package entites;
//8
public class Salarie {
	String nom;
	String prenom;
	double salaire;
	public Salarie(String nom, String prenom, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	@Override
	public String toString()
	{
		return "Monsieur "+nom+" "+prenom+" a un salaire de "+salaire+"€";
	}
}
