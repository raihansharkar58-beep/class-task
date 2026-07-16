import java.util.*;
public class storeNumbers_countOddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int oddc=0,evec=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0) evec++;
            else oddc++;
        }
        System.out.println("number of odd numbers = "+ oddc);
        System.out.println("number of even numbers ="+ evec);

    }
    
}
