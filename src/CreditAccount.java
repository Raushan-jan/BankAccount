public class CreditAccount extends Account implements Pay {

    public CreditAccount(int balance) {
        super(balance);
    }

    @Override
    public void transfer(Account account, int amount) {
        account.addaMoney(amount);
        System.out.println(balance+amount);
    }

    @Override
    public void addaMoney(int amount) {
        if (balance > 0) {
            System.out.println("Нельзя пополнить счет");
        } else System.out.println(balance+amount);
    }

    @Override
    public void Pay(int amount) {
        balance = balance - amount;
    }
}

