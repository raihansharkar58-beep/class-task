public class Main{
    public static void main(String[] argc){
        float base=3.0f;
        float height=4.5f;
        System.out.println("area = "+ 0.5f*base*height);
        // 4/3 * pi * radius^3
        float pi=3.1416f, redius=5.6f;
        System.out.println("volume of sphere = " +(4.0f/3.0f)*pi*redius*redius*redius  );
        //pi * radius^2
        System.out.println("area of a circle = " + pi*redius*redius);
        //C / 5 = (F - 32) / 9
        
        float C=50.f;
        System.out.println(C+" celcius = " + ((9.0f/5)*C+32 )+ " fehrenhight");
        //Find the area of a equilateral triangle: (√3 / 4) * arm^2
        float arm=3.7f;
        System.out.println("area of equilateral triangle = " + (float)(Math.sqrt(3)/4*arm*arm));
        //Find the area of a triangle (2) : √(s *(s-a)*(s-b)*(s-c)) 
        //where s = (a+b+c) / 3
        float a=4.3f,b=3.2f,c=5.7f;
        float s=(a+b+c)/2.0f;
        float sqarea=s*(s-a)*(s-b)*(s-c);
        System.out.println("area of a triangle="+ (float)Math.sqrt(sqarea));

    }
}