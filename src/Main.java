public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(500000);
        savingsAccount.addaMoney(15000);
        CheckingAccount checkingAccount=new CheckingAccount(450000);
        checkingAccount.Pay(15000);
        checkingAccount.addaMoney(1222);
        CreditAccount creditAccount=new CreditAccount(58000);

    }
}
