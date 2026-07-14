import java.util.*;
public class find_greatest_number {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] series=new int[n];
        //int mx=Integer.MIN_VALUE;
    
        for(int i=0;i<n;i++){
            series[i]=sc.nextInt();
            //if(mx<series[i]) mx=series[i];
        }
        Arrays.sort(series);
        
        //System.out.println(Arrays.toString(series));
        System.out.println(series[n-1]);
    } 
    
}
