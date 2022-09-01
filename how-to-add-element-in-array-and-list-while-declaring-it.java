#Returning an array without assign to a variable
You still need to create the array, even if you do not assign it to a variable. Try this:

public int[] getData() {
    return new int[] {a,b,c,d};
}
Your code sample did not work because the compiler, for one thing, still needs to know what type you are attempting to create via static initialization {}.

#Returning an list without assign to a variable
// return new ArrayList<Integer>({1,2,3});
//you cannot do this
// There is no constructor in Collection classes which takes an array. 
// You can use java.util.Arrays.asList method to get a fix sized list of the array. 
// But don't pass a primitive array to the asList method otherwise you won't get the desired result..
return new ArrayList<Integer>(Arrays.asList(1,2,4,5)); //you can do this
