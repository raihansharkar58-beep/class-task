class Wallet {
    private double balance;
    final int id;
    static int counter = 0;
    private String lstwthdr = "normal withdraw";

    Wallet() {
        counter++;
        id = counter;
        this.balance = 0;
    }

    Wallet(double balance) {
        counter++;
        this.id = counter;
        this.balance = balance;
    }

    void deposite(double amount) {
        this.balance += amount;
        System.out.println(amount + " is deposited");
    }

    void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println(amount + " is not possible to withdraw because of low balance!");
        } else {
            this.balance -= amount;
            System.out.println(amount + " is withdrawed");
        }
        this.lstwthdr = "normal withdraw";

    }

    void withdraw(double amount, String lstwthdr) {
        if (amount > this.balance) {
            System.out.println(amount + " is not possible to withdraw because of low balance!");
        } else {
            this.balance -= amount;
            System.out.println(amount + " is withdrawed");
        }
        this.lstwthdr = lstwthdr;

    }

    double getbalance() {
        return this.balance;
    }

    void setbalance(double balance) {
        this.balance = balance;
    }

    void lastwithdrawmethod() {
        System.out.println(this.lstwthdr);
    }
}

public class Wallet_task_4 {
    public static void main(String[] args) {
        Wallet w1 = new Wallet();
        w1.deposite(500000);
        System.out.println("Current balance = " + w1.getbalance());
        w1.withdraw(600000);
        w1.lastwithdrawmethod();
        w1.withdraw(700000, "ATM");
        w1.withdraw(0);
        w1.lastwithdrawmethod();
        System.out.println("Current balance = " + w1.getbalance());

    }

}
