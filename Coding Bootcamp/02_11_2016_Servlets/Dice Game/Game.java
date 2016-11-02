package org.afdemp.bootcamp.dimitristheo;

public class Game {
	int dice1, dice2;
	int counter = 0;

	public String play() {
		counter += 1;
		if (counter % 2 == 1) {
			dice1 = (int) (Math.random() * 6 + 1);
		} else {
			dice2 = (int) (Math.random() * 6 + 1);
			if (dice1 >= dice2) {
				return "Player 1 wins!";
			} else {
				return "Player 2 wins!";
			}
		}
		return "waiting for the player 2 to roll the dice";
	}
}
