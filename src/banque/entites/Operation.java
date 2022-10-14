package banque.entites;

public abstract class Operation {

	String date;
	double montant;
	
	public Operation (String date, double montant)
	{
		this.date = date;
		this.montant = montant;
	}
	
	public abstract double moneyMove() ; 
	public abstract String getType();

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
}
