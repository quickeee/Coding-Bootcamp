package org.afdemp.bootcamp.dimitristheo;

public class PrimeNumber {

	public boolean primeNumberCheck(int prime) {
		for (int i = 2; i < prime; i++) {
			if (prime % i == 0) {
				return false;
			}
		}
		return true;
	}
}