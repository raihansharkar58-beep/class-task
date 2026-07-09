import java.util.*;

public class Main{
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] ar = new int[3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ar[i][j]=sc.nextInt();
            }
        }
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int x = sc.nextInt();

            for(int j=0;j<3;j++){
                
                for(int k=0;k<3;k++){
                    if(x==ar[j][k]){
                        ar[j][k]=-1;
                        
                    }
                }
            }
        }
        if(ar[0][0]==-1 && ar[1][1]==-1 && ar[2][2]==-1){
            System.out.println("Yes");
            return;
        }
        if(ar[0][2]==-1 && ar[1][1]==-1 && ar[2][0]==-1){
            System.out.println("Yes");
            return;
        }
        for(int i=0;i<3;i++){
            int count=0;
            for(int j=0;j<3;j++){
                if(ar[i][j]==-1) count++;
            }
            if(count==3){ 
                System.out.println("Yes");
                return;
            }
        }
            for(int i=0;i<3;i++){
            int count=0;
            for(int j=0;j<3;j++){
                if(ar[j][i]==-1) count++;
            }
            if(count==3){ 
                System.out.println("Yes");
                return;
            }
        }

        
    System.out.println("No");
    return;
        
}
}