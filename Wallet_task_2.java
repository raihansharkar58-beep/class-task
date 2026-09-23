class Wallet{
    private int balance;

    void deposite(int amount){
        this.balance+=amount;
        System.out.println(amount+" is deposited");
    }
    void withdraw(int amount){
        if(amount>this.balance){
            System.out.println(amount+" amount is not possible to withdraw because of low balance");
        }else{
            this.balance-=amount;
            System.out.println(amount+" is withdrawed");
        }
    }
    void setbalance(int balance){
        this.balance=balance;
    }
    int getbalance(){
        return this.balance;
    }
}
public class Wallet_task_2 {
    public static void main(String[] args) {
        Wallet w1=new Wallet();
        w1.setbalance(60000);
        System.out.println("Current balance is "+w1.getbalance());
        w1.deposite(13400);
                System.out.println("Current balance is "+w1.getbalance());
        w1.withdraw(100000);
                System.out.println("Current balance is "+w1.getbalance());
        w1.withdraw(40000);
                System.out.println("Current balance is "+w1.getbalance());

    }
    
}
