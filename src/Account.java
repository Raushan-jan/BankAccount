public abstract class Account {
    int balance;

    public Account(int amount) {
        this.balance = balance;
    }

    public abstract void transfer(Account account, int amount);

    public abstract void addaMoney(int amount);

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
