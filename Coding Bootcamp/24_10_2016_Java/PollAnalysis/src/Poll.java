import java.util.Scanner;

public class Poll {

	static int i;
	static int rating;
	static int[] ratingResults = new int[40];
	static int freq1, freq2, freq3, freq4, freq5, freq6, freq7, freq8, freq9, freq10;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		for (i = 0; i <= 39; i++) {
			int a = input.nextInt();
			ratingResults[i] = a;
			while (a < 1 || a > 10) {
				System.out.println(
						"Dear user please enter again and remember the rating has to be between 1 and 10! Thx a lot!");
				a = input.nextInt();
				ratingResults[i] = a;
			}
		}

		for (i = 0; i <= 39; i++) {
			switch (ratingResults[i]) {
			case 1:
				freq1 += 1;
				break;
			case 2:
				freq2 += 1;
				break;
			case 3:
				freq3 += 1;
				break;
			case 4:
				freq4 += 1;
				break;
			case 5:
				freq5 += 1;
				break;
			case 6:
				freq6 += 1;
				break;
			case 7:
				freq7 += 1;
				break;
			case 8:
				freq8 += 1;
				break;
			case 9:
				freq9 += 1;
				break;
			case 10:
				freq10 += 1;
				break;
			}

		}
		System.out.println("Rating" + "  " + "Frequency\n" + "1" + "       " + freq1 + "\n" + "2" + "       " + freq2
				+ "\n" + "3" + "       " + freq3 + "\n" + "4" + "       " + freq4 + "\n" + "5" + "       " + freq5
				+ "\n" + "6" + "       " + freq6 + "\n" + "7" + "       " + freq7 + "\n" + "8" + "       " + freq8
				+ "\n" + "9" + "       " + freq9 + "\n" + "10" + "      " + freq10);
	}
}
