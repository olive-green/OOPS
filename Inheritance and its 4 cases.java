import java.util.*;
import java.io.*;

class Main{
    public static class P{
        int d=1;
        int d1=10;
        
        void fun(){
            System.out.println("Pfun");
        }
        void fun1(){
            System.out.println("Pfun1");
        }
        
    }
    
    public static class C extends P{
        int d=2;
        int d2=20;
        
        void fun(){
            System.out.println("Cfun");
        }
        void fun2(){
            System.out.println("Cfun2");
        }
    }
    
    // Java by default looks for a method

    //     public static void main (String[] args) { }
    //     or say
        
    //     public static void main (String ...args) {}
    
    // case1
    public static void main(String[] args){
        P obj=new P();    // error: non-static variable this cannot be referenced from a static context if we couldn;t make P as static function
        
        System.out.println(obj.d); //1
        System.out.println(obj.d1);//10
        obj.fun();//Pfun
        obj.fun1();//Pfun1
        
        
    }
    
    
    //case 2
    public static void main(String[] args){
        C obj=new C();    
        
        System.out.println(obj.d); //2
        System.out.println(obj.d1);//10
        obj.fun();//Cfun
        obj.fun1();//Pfun1
        obj.fun2();//Cfun2
    }
    
    //case 3
    public static void main(String[] args){
        P obj=new C();    
        
        System.out.println(obj.d); //1
        System.out.println(obj.d1);//10
        System.out.println(obj.d2);//error
        obj.fun();//Pfun
        obj.fun1();//Pfun1
        obj.fun2();//error
        
        // line 67 and 70 gives complier error because at compile time it only sees lHS variable and LHS is having P's reference and P does not have any property like d2 and F2()
        // Main.java:67: error: cannot find symbol
        // System.out.println(obj.d2);
        //                               ^
        //   symbol:   variable d2
        //   location: variable obj of type P
        // Main.java:70: error: cannot find symbol
        //         obj.fun2();//error
        //           ^
        //   symbol:   method fun2()
        //   location: variable obj of type P
        // 2 errors
    }
    
    //case4
    public static void main(String[] args){
        C obj=new P(); //error
        Main.java:88: error: incompatible types: P cannot be converted to C
                C obj=new P();
                      ^
        1 error
    }
    
    
}