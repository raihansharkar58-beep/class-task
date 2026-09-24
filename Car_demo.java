class Car{
final String name;
final String brand;
final int serialnum;
static int counter;
double fuel;

Car(String name,String brand,double fuel){
    this.name=name;
    this.brand=brand;
    counter++;
    this.serialnum=counter;
    this.fuel=fuel;

}
void start(){
    System.out.println(this.name+" car is started");
    this.fuel-=10;
}
void stop(){
    System.out.println(this.name+" is stopped");

}
void currentfuel(){
    System.out.println("Current fuel = "+this.fuel+"liters");
}

}
public class Car_demo {
    public static void main(String[] args) {
        Car c1=new Car("Roles Royal","Roles Royal",20.4);
        System.out.println(c1.name);
        System.out.println(c1.brand);
        c1.start();
        System.out.println("current fuel = "+c1.fuel);
    }
    
}
