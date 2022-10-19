package fichier;

public class Ville {

	String name;
	String dep;
	String reg;
	int pop;
	
	public Ville(String name, String dep, String reg, int pop) {
		super();
		this.name = name;
		this.dep = dep;
		this.reg = reg;
		this.pop = pop;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public int getPop() {
		return pop;
	}

	public void setPop(int pop) {
		this.pop = pop;
	}
	
	

}
