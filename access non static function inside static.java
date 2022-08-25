/*package whatever //do not write package name here */

import java.io.*;


class GFG {
    public void fun(){
        System.out.println("hi");
    }
    public class Person{
        int l=2;
        void print(){
         
         System.out.println(l);
            
        }
    }
	public static void main (String[] args) {
	   // fun(); //it shows error
	   //but we can access non static function inside static by creating object of that class
	   GFG Mainobj=new GFG();
	   Mainobj.fun();
	   
	   //Ex-2
	   GFG.Person personObj=Mainobj.new Person();
	   personObj.print();
	   
	}
}
class A{
    void funA(){
        System.out.println("funA");
    }
}