package banque.entites;



public class Compte {

	private int number;
	private double solde;
	
	
	public Compte (int numCo, int solCo)
	{
		number = numCo;
		solde = solCo;
	}

	public String toString()
	{
		return "Le compte numéro : "+number+" a un solde de "+solde+"€";
	}

	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
}
