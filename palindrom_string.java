import java.util.*;
public class palindrom_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        int n=str1.length();
        //int i=0,j=n-1;
        String str2="";
       for(int i=n-1;i>=0;i--){
        str2+=str1.charAt(i);
       }
       System.out.println(str1);
       System.out.println(str2);
       if(str1.equals(str2)){
        System.out.println("It is a palindrom");
       }else{
        System.out.println("It is not a palindrom");
       }
    }
}
