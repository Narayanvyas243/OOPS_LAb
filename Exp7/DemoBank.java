
interface Bank {

    void withdraw(double amount);

    void deposit(double amount);

}

class Account implements Bank {
    private float balance = 5000;

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            System.out.println(" withdrawed amount " + amount);
        } else {
            System.out.println("not enough balance ");
        }
        balance -= amount;
        System.out.println(" current balance " + balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println(" amount deposited " + amount);
        balance += amount;
        System.out.println(" total balance =" + balance);

    }

}

class DemoBank {
    public static void main(String[] args) {
        Bank b = new Account();
        b.withdraw(50);
        b.deposit(2000);

        Bank b1 = new Account();
        b1.withdraw(150);
        b1.deposit(25000);

    }
}
/*
 * error
 * 1. in creating object
 * 2. balance was not private
 */