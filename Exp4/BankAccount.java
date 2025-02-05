class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void makeDeposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    protected void makeWithdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    double showBalance() {
        System.out.println("Current balance: $" + balance);
        return balance;
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500);

        myAccount.makeDeposit(200);
        myAccount.makeWithdrawal(100);
        myAccount.showBalance();
    }
}

class AccountTester {
    public static void main(String[] args) {
        BankAccount anotherAccount = new BankAccount(1000);
        anotherAccount.makeDeposit(300);
        anotherAccount.showBalance();
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void addInterest() {
        double interest = showBalance() * 0.02;
        makeDeposit(interest);
        System.out.println("Interest added.");
    }
}