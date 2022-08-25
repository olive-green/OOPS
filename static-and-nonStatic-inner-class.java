import java.util.*;
import java.io.*;

public class Main{
     

      public static void main(String[] args){
        Outer.staticInner staticObj=new Outer.staticInner();
        staticObj.print(); //nested static abc
        
        //to access non-static nested class we have to create instance of outer class
        // Outer.nonStaticinner nonStaticobj=new Outer.nonStaticinner(); //it gives error
        // nonStaticobj.print();
        
        Outer outerObj=new Outer();
        Outer.nonStaticinner nonStaticobj=outerObj.new nonStaticinner();
        nonStaticobj.print();//nested non-static abc 23
        
        
        
    }
}

 class Outer{
    static String msg="abc";
    int age=23;
    
    //static nested inner class
    static class staticInner{
        void print(){
            System.out.println("nested static "+msg);
        }
    }
    //non-static nested inner class
     class nonStaticinner{
        void print(){
            System.out.println("nested non-static "+msg+" "+ age);
        }
    }
}
    