class Wallet{
    int balance;
    int withdraw(int bal){
        if(bal>this.balance){
            System.out.println("withdraw is not possible because current balance is low");
            return balance;
        }
        return balance-bal;
    }
int deposite(int balance){
    return this.balance+balance;
}
void printbalance(){
    System.out.println("balance = "+this.balance);
}
}
public class Wallet_task_1 {
    public static void main(String[] args) {
        Wallet w1=new Wallet();
        w1.balance=20000;
        w1.balance=w1.deposite(5000);
        System.out.println("new balance = "+w1.balance);
        w1.balance=w1.withdraw(50000);
                System.out.println("new balance = "+w1.balance);

        w1.balance=w1.withdraw(6000);
                System.out.println("new balance = "+w1.balance);

    }
}
