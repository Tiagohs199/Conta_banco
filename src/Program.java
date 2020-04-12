import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Tiago", 1000.0);
		BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.0);
		
		// upcasting
		
		Account acc1  = bacc; 
		Account acc2 = new BusinessAccount(1003, "carlos", 1000.0, 200.0);
		Account acc3 = new SavingAccount(1004,"fer", 1000.0, 0.05);
		
		// downcasting
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		
		 
		
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.Loan(200.0);
		}
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("update!");
		}
		
		acc.WithDraw(150.0);
		acc3.WithDraw(150.0);
		
		acc2.WithDraw(100.0);
		
		System.out.println("conta corrente: "+acc.getBalance());
		System.out.println("conta poupanca: "+acc3.getBalance());
		System.out.println("conta business: "+acc2.getBalance());
	}

}
