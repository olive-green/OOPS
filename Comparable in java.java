import java.util.*;

public class Main {

  public static void main(String[] args) {
    // Write your code here
    Car[] cars=new Car[5];

    cars[0]= new Car(200,100,"A");
    cars[1]= new Car(300,500,"B");
    cars[2]= new Car(100,200,"C");
    cars[3]= new Car(500,50,"D");
    cars[4]= new Car(2000,10,"E");

    ArrayList<Car> l1=new ArrayList<>();

    for(Car c: cars){
      l1.add(c);
    }
    Collections.sort(l1);
    System.out.println(l1);

  }
  static class Car implements Comparable<Car> {
    int speed;
    int price;
    String name;

    Car(int speed,int price,String name){
      this.speed=speed;
      this.price=price;
      this.name=name;
    }
    public String toString(){
      return "{" + this.speed +"," +this.price+","+this.name+"]";
    }

    //now we write compareTo function to sort particular member wise
    public int compareTo(Car other){
      //this.speed>other.speed = +ve;
      //this.speed<other.speed= -ve;
      //this.speed==other.speed= 0;
      return this.speed-other.speed;
    }
  }
}