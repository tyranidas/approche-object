package banque.entites;

public class Credit extends Operation {

	public Credit(String date, double montant) {
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
		return "CREDIT";
	}
	
}
