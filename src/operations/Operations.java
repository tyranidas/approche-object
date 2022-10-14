package operations;

public class Operations {
	
	double a;
	double b;
	char opé;
	
	public Operations(double a, double b, char opé)
	{
		this.a=a;
		this.b=b;
		this.opé=opé;
	}
	
	public String toString()
	{
		return this.a+" "+this.opé+" "+this.b+" = "+calcul();
	}
	public double calcul()
	{
		switch(this.opé)
		{
		case '+': {
			return this.a+this.b;
			
			}
		case '-':{
			return this.a-this.b;
		
			}
		case '*':{
			return this.a*this.b;
			
			}
		case '/':{
			return this.a/this.b;
		
			}
		default:{
			return 0;
		}
		}
	}
	
}
