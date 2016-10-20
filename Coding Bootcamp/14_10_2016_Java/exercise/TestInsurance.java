import java.util.Scanner;

public class TestInsurance {

	public static Customer[] customers = new Customer[3];
	public static Insurance[] insurances = new Insurance[6];
	/*
	 * Life[] lifeInsurances = new Life[10]; Health[] healthInsurances = new
	 * Health[10];
	 */

	public static void main(String[] args) {
		Customer customer1 = new Customer("Dimitris", 1989, "male");
		Customer customer2 = new Customer("Olga", 1993, "female");
		Customer customer3 = new Customer("Giwrgos", 1991, "male");
		customers[0] = customer1;
		customers[1] = customer2;
		customers[2] = customer3;
		Insurance life1 = new Life(200, 0, 6);
		Insurance life2 = new Life(190, 1, 11);
		Insurance life3 = new Life(640, 2, 18);
		Insurance health1 = new Health(240, 0, 16);
		Insurance health2 = new Health(220, 1, 15);
		Insurance health3 = new Health(580, 2, 29);
		insurances[0] = life1;
		insurances[1] = health1;
		insurances[2] = life2;
		insurances[3] = health2;
		insurances[4] = life3;
		insurances[5] = health3;
		int menuChoice;
		Scanner input = new Scanner(System.in);
		String menu = "\n*****MENU*****\n1. Print all Insurances\n2. Search insurances by customer code\n3. Search insurances by insurance code";
		do {
			System.out.println(menu);
			menuChoice = input.nextInt();

			switch (menuChoice) {
			case 1:
				int i;
				for (i = 0; i < insurances.length; i++) {
					System.out.println(insurances[i].toString());
				}
				break;
			case 2:
				System.out.println("Please enter the customers code you would like to search:");
				int a = input.nextInt();
				for (i = 0; i < insurances.length; i++) {
					if (insurances[i].getCustomersCode() == a) {
						System.out.println(insurances[i].toString());
					}
				}
				break;
			case 3:
				System.out.println("Please enter the insurance code you would like to search:");
				int b = input.nextInt();
				for (i = 0; i < insurances.length; i++) {
					if (insurances[i].getInsuranceCode() == b) {
						System.out.println(insurances[i].toString());
					}
				}
				break;
			}
		} while (menuChoice != 0);
	}
}
