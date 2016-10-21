
public class BootCamp {

	public static void welcome(double argument) throws DigitException, AnotherDigitException {

		if (argument > 25) {

			throw new DigitException();
		} else {
			throw new AnotherDigitException();
		}
	}

	public static void main(String[] args) throws AnotherDigitException {
		try {
			BootCamp.welcome(400.8);
		} catch (DigitException a) {
			a.message();
		}
	}

	public int bye() {
		try {
			welcome(299.7);
			return 0;
		} catch (DigitException a) {
			a.message();
			return 605;
		} catch (AnotherDigitException b) {
			return 230;
		}
	}
}