public class Pizza {
	public PrizeDiam[] options;
	public String name;

	public Pizza(String name, PrizeDiam[] options) {
		this.name = name;
		this.options = options;
	}

	public PrizeDiam get_best_value() {
		PrizeDiam best = this.options[0];
		for (int i = 1; i < this.options.length; i++) {
			if (best.get_ratio() < this.options[i].get_ratio()) {
				best = this.options[i];
			}
		}
		return best;
	}

	@Override
	public String toString() {
		String diams = "[\n";
		for (int i = 0; i < options.length; i++) {
			diams += "\t" + options[i];
			if (i < (options.length - 1)) {
				diams += ",";
			}
			diams += "\n";
		}
		diams += "]";
		return "Pizza: " + this.name + "\n" + diams;
	}
}
