package essais;

import operations.Operations;
import operations.CalculMoyenne;

public class TestOperations {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations add = new Operations(2,4,'+');
		System.out.println(add);
		Operations soust = new Operations(2,4,'-');
		System.out.println(soust);
		Operations mult = new Operations(2,4,'*');
		System.out.println(mult);
		Operations div = new Operations(2,4,'/');
		System.out.println(div);
		
		double[] tab0 = {1,1,1,1};
		CalculMoyenne tab1 = new CalculMoyenne(tab0);
		System.out.println(tab1);
		
		double[] tab2 = CalculMoyenne.ajout(tab0, 6);
		CalculMoyenne tab3 = new CalculMoyenne(tab2);
		System.out.println(tab3);
	}

}
