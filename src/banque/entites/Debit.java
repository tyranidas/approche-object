package banque.entites;

public class Debit extends Operation {

	public Debit(String date, double montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double moneyMove()
	{
		double a = this.montant;
		return a;
	}
	@Override
	public String getType()
	{
		return "DEBIT";
	}
	
}
