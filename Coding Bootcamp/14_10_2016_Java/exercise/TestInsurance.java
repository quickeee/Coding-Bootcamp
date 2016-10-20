import java.util.Scanner;

public class TestInsurance {

	public static void main(String[] args) {
		new Customer("Dimitris", 1989, "male");
		new Customer("Olga", 1993, "female");
		new Customer("Giwrgos", 1991, "male");
		new Life(200, 0, 6);
		new Life(190, 1, 11);
		new Life(640, 2, 18);
		new Health(240, 0, 16);
		new Health(580, 2, 29);
		new Health(220, 1, 15);

		int menuChoice;
		Scanner input = new Scanner(System.in);
		String menu = "\n*****MENU*****\n1. Print all Insurances\n2. Search insurances by customer code\n3. Search insurances by insurance code";
		do {
			System.out.println(menu);
			menuChoice = input.nextInt();

			switch (menuChoice) {
			case 1:
				int i;
				for (i = 0; i < Insurance.insurances.length; i++) {
					System.out.println(Insurance.insurances[i].toString());
				}
				break;
			case 2:
				System.out.println("Please enter the customers code you would like to search:");
				int a = input.nextInt();
				for (i = 0; i < Insurance.insurances.length; i++) {
					if (Insurance.insurances[i].getCustomersCode() == a) {
						System.out.println(Insurance.insurances[i].toString());
					}
				}
				break;
			case 3:
				System.out.println("Please enter the insurance code you would like to search:");
				int b = input.nextInt();
				for (i = 0; i < Insurance.insurances.length; i++) {
					if (Insurance.insurances[i].getInsuranceCode() == b) {
						System.out.println(Insurance.insurances[i].toString());
					}
				}
				break;
			}
		} while (menuChoice != 0);
	}
}
