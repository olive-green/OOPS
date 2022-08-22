/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    String s="abc";
	    int i=0;
	    s=s.substring(0,i)+'s'+s.substring(i+1);
		
	    //2nd method
	    //convert string into char[]
	    char[] temp=s.toCharArray();
	    temp[i]='s';
	    s=String.valueOf(temp);
	    
	    //using StringBuilder
	    StringBuilder temp=new StringBuilder(s);
	    temp.setCharAt(i,'s');
	    s=temp.toString();
	    
	    
		System.out.println(s);
	}
}
