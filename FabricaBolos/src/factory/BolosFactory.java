package factory;

public class BolosFactory {

	public Bolos assarBolo(String bolo) {

		if (bolo == "" || bolo == null) {

			return null;
		}

		else if (bolo.equals("chocolate")) {

			return new Chocolate();

		}

		else if (bolo.equals("fuba")) {

			return new Fuba();

		} else if (bolo.equals("milho")) {

			return new Milho();

		}

		return null;

	}

}
