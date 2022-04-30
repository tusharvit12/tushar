import java.util.Random;

public class AssociationTest {

	public static void main(String[] args) {
		Random rd=new Random();
		
		BankAccount x = new BankAccount(rd.nextInt( Integer.MAX_VALUE ),"Terry",50000,"9820443464");
		x.printBankAccount();
		
		System.out.println("----");
		BankAdmin admin = new BankAdmin();
		admin.changeMobileNumberOfAccountHolder(x, "9920445566");
		System.out.println("======");
		x.printBankAccount();
		System.out.println("----Change Account Holder Name----");
		admin.changeAccountHolderNameA(x, "Dave");
		x.printBankAccount();
		System.out.println("----Deposit Balance----");
		admin.depositAmount(x, 10000);
		x.printBankAccount();
		System.out.println("----Withdraw Balance----");
		admin.withdrawAmount(x, 8000);
		x.printBankAccount();
	
		

	}
}
class BankAdmin
{
	void changeMobileNumberOfAccountHolder(BankAccount y, String z) { // y=x;
		y.setMobileNumber(z);
	}
	
	void changeAccountHolderNameA(BankAccount y, String z) { // y=x;
		y.setAccountHolderNamer(z);
	}
	
	void depositAmount(BankAccount y, double z) { // y=x;
		y.setDepositAmount(z);
	}
	
	void withdrawAmount(BankAccount y, double z) { // y=x;
		y.setWithdrawAmount(z);
	}
}