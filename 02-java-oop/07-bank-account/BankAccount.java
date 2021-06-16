import java.util.Random;

public class BankAccount{

    public static int numberOfAccount = 0;
    public static int totalAmount = 0;
    private String accountNumber;
    private double checkingBalance;
    private double savingBalance;
    
    public BankAccount() {
		numberOfAccount += 1;
		this.checkingBalance = 0;
		this.savingBalance = 0;
		this.accountNumber = this.setAccountNumber();
    }
    public static int totalAccount() {
        return numberOfAccount;
    }


    public void deposit(double amount, String accountType) {
		if(accountType.equals("saving")){
            this.savingBalance += amount;
        }
		else if(accountType.equals("checking")){
            this.checkingBalance += amount;
        }
    }

    public void withdraw(double amount, String accountType) {

		if(accountType.equals("saving")) {
			if(this.savingBalance - amount >= 0) {
				this.savingBalance -= amount;
            }
            else{
                System.out.println("You don't have enough balance");
            }
		}
		else if(accountType.equals("checking")) {
			if(this.checkingBalance - amount >= 0) {
				this.checkingBalance -= amount;
            }
            else{
                System.out.println("You don't have enough balance");
            }
        }


    }
    public void showBalance() {
            System.out.println("Saving Balance: " + this.savingBalance); 
            System.out.println("Checking Balance: " + this.checkingBalance);
    }

    public double getTotal() {
		double total =this.savingBalance + this.checkingBalance;
		return total;
	}

    public double getCheckingBalance() {
		return this.checkingBalance;
	}

	public double getSavingBalance() {
		return this.savingBalance;
    }
    
    public String setAccountNumber(){
        String aN = "";
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			aN += r.nextInt(10);
		}

        return aN;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
}

