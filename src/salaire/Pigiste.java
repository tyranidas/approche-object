package salaire;

public class Pigiste extends Intervenant {

	double salaireDay;
	double workDay;
	
	public Pigiste(String nom, String prenom, double workDay, double salaireDay) {
		super(nom, prenom);
		this.workDay= workDay;
		this.salaireDay=salaireDay;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return this.workDay*this.salaireDay;
	}
	
	@Override
	public  String getType()
	{
		return "Pigiste";
	}

}
