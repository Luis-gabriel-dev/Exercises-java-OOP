package entities;

public class Student {

	public String name;
	public double x;
	public double y;
	public double z;

	public double total() {
		return x + y + z;

	}

	public double missing() {
		if (total() < 60.0) {
			return 60.0 - total();
		} else {
			return 0.0;
		}
	}
}
