import java.util.Scanner;

public class task2{
    public static void main(String[] argc){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter base and height of triangle:");

        float base= sc.nextFloat();
        float height=sc.nextFloat();
        System.out.println("area = "+ 0.5f*base*height);
        // 4/3 * pi * radius^3
        System.out.println("Enter the radius of a circle: ");
        float pi=3.1416f, redius=sc.nextFloat();
        System.out.println("volume of sphere = " +(4.0f/3.0f)*pi*redius*redius*redius  );
        //pi * radius^2
        System.out.println("area of a circle = " + pi*redius*redius);
        //C / 5 = (F - 32) / 9
        System.out.print("Enter temperature in celcius: ");
        float C=sc.nextFloat();
        System.out.println(C+" celcius = " + ((9.0f/5)*C+32 )+ " fehrenhight");
        //Find the area of a equilateral triangle: (√3 / 4) * arm^2
        System.out.print("Enter one arm of equilateral triangle:");
        float arm=sc.nextFloat();
        System.out.println("area of equilateral triangle = " + (float)(Math.sqrt(3)/4*arm*arm));
        //Find the area of a triangle (2) : √(s *(s-a)*(s-b)*(s-c))
        //where s = (a+b+c) / 3
        System.out.print("Enter three side of a triangle :");
        float a=sc.nextFloat(),b=sc.nextFloat(),c=sc.nextFloat();
        float s=(a+b+c)/2.0f;
        float sqarea=s*(s-a)*(s-b)*(s-c);
        System.out.println("area of a triangle="+ (float)Math.sqrt(sqarea));

    }
}