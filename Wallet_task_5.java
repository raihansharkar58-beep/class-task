class Wallet{
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
    void addbonus(Wallet wr,double amount){
        wr.deposite(amount);
        System.out.println(amount+" is added to the balance as bonus");
    }

    void swapwallet(Wallet w1,Wallet w2){
        Wallet tmp=w1;
        w1=w2;
        w2=tmp;
    }
}
public class Wallet_task_5 {
    public static void main(String[] args) {
        Wallet w1=new Wallet();
        Wallet w2=new Wallet(400000.0);
        w1.deposite(5000);
        System.out.println("current balance = "+w1.getbalance());
        w1.addbonus(w1,5000);
                System.out.println("current balance = "+w1.getbalance());
        w1.swapwallet(w1, w2);
                System.out.println("current balance = "+w1.getbalance());
        System.out.println("current balance = "+w2.getbalance());

        /*in java it is not possible to swap two variable through passing referance in metod */



    }
    
}
