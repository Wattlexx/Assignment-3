package CreateLoans;

public class Loan implements LoanConstants{
	private int loanNumber;
	private String lastName;
	private double loanAmount;
	private double interestRate;
	private int term;
	
	public Loan (int num, String name, double lAmt, double iRate, int term) {
		loanNumber = num;
		lastName = name;
		interestRate = iRate;
		if (lAmt > maxLoanAmount) {
			System.out.println("THe loan amount exceeds the max loan amount");
			loanAmount = maxLoanAmount;
		}
		else {
			loanAmount = lAmt;
		}
		if (term == shortTerm || term == mediumTerm || term == longTerm) {
			this.term = term;
		}
		else {
			this.term = shortTerm;
		}
	}
	
	public String toString() {
		return String.format("Loan number: %d\nLast name: %s\nLoan amount: %.2f\nInterest Rate: %.2f\nTerm: %d year", loanNumber, lastName, loanAmount, interestRate, term);
	}

}
