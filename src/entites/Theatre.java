package entites;

public class Theatre {
	private String name;
	private double capacity;
	private int clientNumber;
	private double recette;
	
	public Theatre(String name, double capacity, int clientNumber, double recette) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.clientNumber = clientNumber;
		this.recette = recette;
	}
	
	public String toString()
	{
		return "Aujourd'hui il y a "+clientNumber+" clients, pour une recette de "+recette+"€";
	}
	
	public void inscrire(int clientNumber, double costPlace)
	{
		if (clientNumber < capacity)
		{
			this.clientNumber = clientNumber;
			recette = clientNumber*costPlace;
		}
		else 
		{
			System.out.println("Il y a plus de client que la capacité de la salle");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public double getRecette() {
		return recette;
	}

	public void setRecette(double recette) {
		this.recette = recette;
	}
	
}
