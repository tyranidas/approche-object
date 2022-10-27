package neuroph;

import java.util.Arrays;

public class DataSetRow {
	double[] entry;
	double exit;

	public DataSetRow() {

		this.entry = generateEntry();
		this.exit = randomBinaire();
	}

	private double[] generateEntry() {
		double e1 = randomBinaire();
		double e2 = randomBinaire();
		double[] e = { e1, e2 };
		return e;
	}

	private double randomBinaire() {
		double e = 0;
		if (Math.random() >= 0.5) {
			e = 1;
		} else {
			e = 0;
		}
		return e;

	}

	@Override
	public String toString() {
		return "DataSetRow [entry=" + Arrays.toString(entry) + ", exit=" + exit + "]";
	}

	public double[] getEntry() {
		return entry;
	}

	public void setEntry(double[] entry) {
		this.entry = entry;
	}

	public double getExit() {
		return exit;
	}

	public void setExit(double exit) {
		this.exit = exit;
	}

}
