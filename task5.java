import java.util.*;
public class task5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0) System.out.println(n+" is a positive number");
        else System.out.println(n+" is an negative number");

        if(n%2==0) System.out.println(n+" is an even number");
        else System.out.println(n+" is a odd number");
    }
}
