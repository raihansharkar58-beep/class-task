import java.util.*;

public class task4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float number=sc.nextFloat();
        number/=10;
        switch ((int)number) {
            case 9:
                System.out.println("A+");
                break;
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("A-");
                break;
                case 6:
                    System.out.println("B");
                    break;
                case 5:
                case 4:
                    System.out.println("C+");
                    break;
        
            default:
                System.out.println("F");
                break;
        }
    }
}