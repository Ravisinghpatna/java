package Practice;

public interface Atm {
	void withdraMoney();
	void primtStmt();
	void changePin();
	void checkBalance();
	void show();
	
}
abstract class RBI
{
	void show()
	{
		System.out.println("RBI Class");
	}
	abstract void printLoanIntrestRate();
}