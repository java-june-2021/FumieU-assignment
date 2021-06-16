public class BankAccountTest{
    public static void main(String[] args){

    BankAccount wellsFargo = new BankAccount();
    wellsFargo.deposit(399.50, "saving");
    wellsFargo.deposit(5000.00, "checking");
    wellsFargo.withdraw(200.00, "checking");
    wellsFargo.showBalance();
    System.out.println(wellsFargo.getTotal());
    System.out.println(wellsFargo.totalAccount());
    System.out.println(wellsFargo.getAccountNumber());

    BankAccount bOfA = new BankAccount();
    bOfA.deposit(5000.00, "checking");
    bOfA.withdraw(1000.00, "checking");
    bOfA.showBalance();
    System.out.println(bOfA.getTotal());
    System.out.println(bOfA.getAccountNumber());


    }
}