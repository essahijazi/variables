public class Main {

	public static void main(String[] args) {
		int myVar;
		
		//System.out.println(myVar);
		
		/*
		 * The statement above will throw an error as local variables don't
		 * automatically get assigned a value
		 * */
		
		
		myVar = 50;
		System.out.println("myVar = " + myVar);
		/*
		 * The statement below will work fine as the 
		 * variable has now been assigned a value
		 * */
		
		
		int anotherVar = 100;
		System.out.println("anotherVar = " + anotherVar);
		
		//we are copying by value
		/*
		 * this means that we are copying the value stored in anotherValue and
		 * storing it in myVar as well. Each variable has its own separate copy
		 * of the value 
		 */
		myVar = anotherVar;
		System.out.println("myVar = " + myVar);
		
		anotherVar = 200;
		System.out.println("anotherVar = " + anotherVar);
		
		System.out.println("myVar = " + myVar);
		
		/*
		 * The last two print statements show that each variable has its own
		 * unique copy of the value and that they are not correlated with one
		 * another. Changing the value of one variable in this instance has
		 * no affect on the value of the other variable
		 * */
	}

}
