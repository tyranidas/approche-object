package banque.entites;

public class ClassTaux extends Compte{

	private double taux;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ClassTaux(int numCo, int solCo, double tauxRemuneration) {
		super(numCo, solCo);
		// TODO Auto-generated constructor stub
		this.taux = tauxRemuneration;
	}
	
	@Override
	public String toString()
	{
		return "Le compte numéro : "+getNumber()+" a un solde de "+getSolde()+"€ et un taux de "+taux+"%.";
	}

}
