package salaire;

public class Salarie extends Intervenant {

	double salaire;
	
	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
		
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaire;
	}
	
	@Override
	public  String getType()
	{
		return "Salarié(e)";
	}
	
}
