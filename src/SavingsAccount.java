public class SavingsAccount extends Account {

    public SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance<amount) {
            System.out.println("Недостаточное средств");
        } else System.out.println(balance-amount);
    }

    @Override
    public void addaMoney(int amount) {
        balance=balance+amount;
        System.out.println(balance);

    }


}
