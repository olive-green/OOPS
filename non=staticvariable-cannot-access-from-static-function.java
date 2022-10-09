// Java program to demonstrate
// why a non-static variable cannot
// be accessed from a static context



class Main {

	// Main method
	public static void main(String args[])
	{
		// Creating multiple objects
		// for class A
		A obj1 = new A();
// 		A obj2 = new A();
// 		A obj3 = new A();

		// Assigning the different values
		// for the non static variable N
// 		obj1.N = 3;
// 		obj2.N = 4;
// 		obj3.N = 5;

		// Calling the method
		A.increment();
       System.out.println(obj1.N);


// 		System.out.println(obj1.N);
// 		System.out.println(obj2.N);
// 		System.out.println(obj3.N);
	}
}
// Creating a class A
class A {

	// A non-static variable
	int N;

	// Static method
	public static void increment()
	{
		// this throws a compile - time error.	
// 		N++; //we can't do this
        // A obj=new A();
        // obj.N++;
        
        
        
	}
}
