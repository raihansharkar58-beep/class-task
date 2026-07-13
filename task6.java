import java.util.*;
public class task6 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    char ch=sc.next().charAt(0);
    int b=sc.nextInt();

    switch(ch){
        case '+':
            System.out.println(a+b);
            break;
        case '-':
            System.out.println(a-b);
            break;
        case '*':
            System.out.println(a*b);
            break;
        case '/':
            System.out.println((float)a/b);
            break;
        default:
            System.out.println("Wrong operation!");
    }
}
}
