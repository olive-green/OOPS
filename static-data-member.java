import java.util.*;
import java.io.*;

class Main{
    public static class BankAccount{
        int anum;//account number
        int money;
        static int roi; //rate of interest
        
        void announce(){
            System.out.println(this.anum+","+this.money+","+this.roi);
        }
        
    }
    
    
    public static void main(String[] args){
        BankAccount a1=new BankAccount();
        a1.anum=10;
        a1.money=100;
        a1.roi=4;//this is bad practice , we should not access static data members using an obj or instance of class instead of 
        //className like BankAccount.roi=4;
        a1.announce(); //10,100,4
        
        BankAccount a2=new BankAccount();
        a2.anum=20;
        a2.money=200;
        a2.roi=5;
        a2.announce();//20,200,5
        a1.announce();//10,100,5 here roi value is change becuase roi is stored in class heap memory not in obj heap memory so it is shared by all objects
    }
    
    
    
}