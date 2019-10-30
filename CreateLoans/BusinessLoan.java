package CreateLoans;

public class BusinessLoan extends Loan{

	public BusinessLoan(int num, String name, double lAmt, double iRate, int term) {
		super(num, name, lAmt, 1, term);
	}
	
}
