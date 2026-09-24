class Wallet{
    private int balance;
    static int counter=0;
    final int id;
    Wallet(){
        counter++;
        this.id=counter;
        this.balance=0;

    }
    Wallet(int balance ){
        counter++;
        id=counter;
        this.balance=balance;
    }
    void deposite(int amount ){
        this.balance+=amount;
        System.out.println(amount+" is deposited");

    }
    void withdraw(int amount){
        if(amount>this.balance){
            System.out.println(amount+" is not possible to withdraw because of low balance!");
        }else{
            this.balance-=amount;
            System.out.println(amount+" is withdrawed");
        }
    }
    int getbalance(){
        return this.balance;
    }
    
}
public class Wallet_task_3 {
    public static void main(String[] args) {
        Wallet w1=new Wallet();
        w1.deposite(100000);
        System.out.println("Current balance = "+w1.getbalance());
        w1.withdraw(200000);
                System.out.println("Current balance = "+w1.getbalance());

        w1.withdraw(45000);
                System.out.println("Current balance = "+w1.getbalance());


                Wallet w2=new Wallet(67000);
        w2.deposite(100000);
        System.out.println("Current balance = "+w2.getbalance());
        w2.withdraw(200000);
                System.out.println("Current balance = "+w2.getbalance());

        w2.withdraw(45000);
                System.out.println("Current balance = "+w2.getbalance());


    }
    
}
