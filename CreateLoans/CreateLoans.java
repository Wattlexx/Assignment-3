package CreateLoans;

import java.util.Scanner;

public class CreateLoans {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		Loan [] obj = new Loan [5];
		for(int i = 0; i < 5; i++) {
			int type;
			int loanNumber = i;
			String lastName;
			double loanAmount;
			double interestRate;
			int term;
			System.out.print("Type of loan (1 for Business, 2 for personal): ");
			type = scan.nextInt();
			System.out.print("Client's last name: ");
			lastName = scan.next();
			System.out.print("Amount of the loan: ");
			loanAmount = scan.nextDouble();
			System.out.print("Current prime interest rate: ");
			interestRate = scan.nextDouble();
			System.out.print("Term of the loan: ");
			term = scan.nextInt();
			
			if (type == 1) {
				obj[i] = new BusinessLoan(loanNumber, lastName, loanAmount, interestRate, term);
			}
			else if (type == 2) {
				obj[i] = new PersonalLoan(loanNumber, lastName, loanAmount, interestRate, term);	
			}
			else {
				obj[i] = new Loan(loanNumber, lastName, loanAmount, interestRate, term);
			}
		}
		
		scan.close();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(obj[i].toString());
		}
	}
}
