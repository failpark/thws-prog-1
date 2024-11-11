public class PrizeDiam {
	private float prize;
	private float diameter;

	public PrizeDiam(float prize, float diam) {
		this.prize = prize;
		this.diameter = diam;
	}

	public float get_prize() {
		return this.prize;
	}

	public float get_diameter() {
		return this.diameter;
	}

	public float get_ratio() {
		return this.diameter / this.prize;
	}

	public String toString() {
		// return "{ prize: " + this.prize + "€, diam: " + this.diameter + "cm }";
		return "{ prize: " + this.prize + "€, diam: " + this.diameter + "cm, ratio: " + this.get_ratio() + "}";
	}
}
