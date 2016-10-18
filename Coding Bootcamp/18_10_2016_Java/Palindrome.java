import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Dear user please enter the word you would like to check if it is a palindrome!!");
		Scanner userInput = new Scanner (System.in);
		String word = userInput.next();
		int i;
		int a;
		int c = 0;
		a = word.length()/2;
		char[] ch = word.toCharArray();
		for (i = 0;i < a;i++) {
			if (ch[i] == ch[word.length() - 1 - i]) {
				c += 1;
			}
		}
		if (c == a) {
			System.out.println("The word you entered is a palindrome one!!!!!");
		}
		else {
			System.out.println("The word you entered is not a palindrome one!!!!");
		}
	}
}
