package CreateLoans;

public class PersonalLoan extends Loan{

	public PersonalLoan(int num, String name, double lAmt, double iRate, int term) {
		super(num, name, lAmt, 2, term);
	}
}
