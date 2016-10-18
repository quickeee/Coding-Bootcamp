import java.util.Arrays;
import java.util.Scanner;

public class Triliza {

	public static void main(String[] args) {
		int c = 1;
		Scanner userInput = new Scanner(System.in);
		String[][] triliza = new String[][] { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
		while (!(Triliza.winControl(triliza)) && !(Triliza.fulFilBoard(triliza))) {
			Triliza.draw(triliza);
			while (true) {
				System.out.println("Dear player please enter the coordinates you would like to play seperately!");
				int a = userInput.nextInt();
				int b = userInput.nextInt();
				if (c == 1 && triliza[a][b] == " ") {
					triliza[a][b] = "X";
					c = 0;
					break;
				} else if (c == 0 && triliza[a][b] == " ") {
					triliza[a][b] = "O";
					c = 1;
					break;
				}
			}
		}
	}

	public static boolean winControl(String[][] triliza) {
		int i;
		int j;

		for (i = 0; i <= 2; i++) {
			if ((triliza[0][i].equals(triliza[1][i])) && (triliza[1][i].equals(triliza[2][i]))
					&& (triliza[0][i] != " ")) {
				System.out.println("Winner Winner Chick And Dinner!!!!");
				Triliza.draw(triliza);
				return true;
			}
		}
		for (i = 0; i < 3; i++) {
			if ((triliza[i][0].equals(triliza[i][1])) && (triliza[i][1].equals(triliza[i][2]))
					&& (triliza[i][0] != " ")) {
				System.out.println("Winner Winner Chick And Dinner!!!!");
				Triliza.draw(triliza);
				return true;
			}
		}
		if ((triliza[0][0].equals(triliza[1][1])) && (triliza[1][1].equals(triliza[2][2])) && (triliza[0][0] != " ")
				&& (triliza[1][1] != " ") && (triliza[2][2] != " ")) {
			System.out.println("Winner Winner Chick And Dinner!!!!");
			Triliza.draw(triliza);
			return true;
		} else if ((triliza[0][2].equals(triliza[1][1])) && (triliza[1][1].equals(triliza[2][0]))
				&& (triliza[0][0] != " ") && (triliza[1][1] != " ") && (triliza[2][2] != " ")) {
			System.out.println("Winner Winner Chick And Dinner!!!!");
			Triliza.draw(triliza);
			return true;
		} else {
			return false;
		}
	}

	public static boolean fulFilBoard(String[][] board) {
		int i;
		int j;
		int counter = 0;
		for (i = 0; i <= 2; i++) {
			for (j = 0; j <= 2; j++) {
				if (board[i][j] != " ") {
					counter += 1;
				}
			}
		}
		if (counter == 9) {
			return true;
		} else {
			return false;
		}

	}

	public static void draw(String[][] triliza) {
		System.out.println(Arrays.toString(triliza[0]));
		System.out.println(Arrays.toString(triliza[1]));
		System.out.println(Arrays.toString(triliza[2]));
	}
}
