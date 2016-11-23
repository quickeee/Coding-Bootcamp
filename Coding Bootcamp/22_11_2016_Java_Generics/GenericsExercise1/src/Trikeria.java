
public class Trikeria {

	/*
	 * @author Dimitris
	 */
	public static void main(String[] args) {
		stenchful();
	}

	public static Granch stenchful() {
		Cellulase cell = new Cellulase();
		Semiserf semi = new Semiserf();
		Mina mina = new Mina();
		Contrite con = new Contrite();
		Granch gra = new Granch();
		Hedonism<Cellulase, Semiserf, Mina, Contrite, Granch> hed = new Hedonism(mina, con, semi, gra, cell);
		Granch test = hed.myoglobin(mina);
		test.print();
		return test;
	}
}
