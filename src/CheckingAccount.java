public class CheckingAccount extends Account implements Pay {
    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance > 0 && balance>amount) {
            balance = balance - amount;
        } else if (balance == 0) {
            System.out.println("Недостаточное средств");
        }
    }

    @Override
    public void addaMoney(int amount) {
        balance = balance + amount;
        System.out.println(balance);

    }

    @Override
    public void Pay(int amount) {
        if (balance > 0 && balance>amount) {
            balance = balance - amount;
            System.out.println(balance);
        } else if (balance == 0) {
            System.out.println("Недостаточное средств");
        }
    }
}
