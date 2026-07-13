public class seriesprint {
    public static void main(String[] args){
        // 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
        System.out.println("Using for loop");
        int sum=0;
        for(int i=2;i<=20;i+=2){
            sum+=i;
            System.out.print(i+" ");
        }
        
        System.out.println();
        System.out.println("sum= "+sum);


         System.out.println("Using while loop");
        int i=2;
        sum=0;
        while (i<=20) {
            System.out.print(i+" ");
            sum+=i;
            i+=2;
        }
        System.out.println();
        System.out.println("sum= "+sum);

         System.out.println("Using do while loop");
        i=2;
        sum=0;
        do{
           System.out.print(i+" "); 
           sum+=i;
           i+=2;
        }while(i<=20);
        System.out.println();
        System.out.println("sum= "+sum);

        // 1, 3, 5, 7, 9, 11, 13, 15, 17, 19
        System.out.println();
        System.out.println();
        sum=0;
        System.out.println("Using for loop");
        for(int j=1;j<=19;j+=2){
            sum+=j;
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println("sum= "+sum);

        System.out.println("Using while loop");
        int j=1;
        sum=0;
        while (j<20) {
            System.out.print(i+" ");
            sum+=j;
            j+=2;
        }
        System.out.println();
        System.out.println("sum= "+sum);

        j=1;
        sum=0;
        do{
           System.out.print(j+" "); 
           sum+=j;
           j+=2;
        }while(j<20);
        System.out.println();
        System.out.println("sum= "+sum);





    }
    
}
