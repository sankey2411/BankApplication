
public class Excercise1 {

	public static void main(String[] args) {

//		question-1

		int age;
		String name;

//		question-2

		age =26;
		name="Sanket";

//		question-3

		System.out.println(name + "  " + age);

//		question-4

		System.out.println("My Name is "+name+" and My Age is "+ age);

//		question-5

		age=30;

		System.out.println(name + "  " + age);

		System.out.println("My Name is "+name+" and My Age is "+ age);


//		question-6

		int m=1, c=15;
		float y,x=0.5f;
		y=(m*x+c);

		System.out.println("The Value of y is "+y);

//		question -7

		boolean isRaining = true;

//		question -8
	    boolean happy = false;

	    // it is raining or we're happy
	    // System.out.println(isRaining || happy);
			//
	    // // it is raining or we're not happy
	    // System.out.println(isRaining || !happy);
			//
	    // // it is not raining or we're happy
	    // System.out.println(!isRaining || happy);
			//
	    // // it is not raining or we're not happy
	    // System.out.println(!isRaining || !happy);
			//
			//
			// // change OR to AND
			//
			// // it is raining AND we're happy
	    // System.out.println(isRaining && happy);
			//
	    // // it is raining AND we're not happy
	    // System.out.println(isRaining && !happy);
			//
	    // // it is not raining AND we're happy
	    // System.out.println(!isRaining && happy);
			//
	    // // it is not raining AND we're not happy
	    // System.out.println(!isRaining && !happy);



			System.out.println(isRaining || happy ? "It is raining or we're happy" : "It is not raining and we're not happy");
			System.out.println(isRaining || !happy ? "It is raining or we're not happy" : "It is not raining and we're happy");
			System.out.println(!isRaining || happy ? "It is not raining or we're happy" : "It is raining and we're not happy");
			System.out.println(!isRaining || !happy ? "It is not raining or we're not happy" : "It is raining and we're happy");

			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println(isRaining && happy ? "It is raining and we're happy" : "It is not raining or we're not happy");
			System.out.println(isRaining && !happy ? "It is raining and we're not happy" : "It is not raining or we're happy");
			System.out.println(!isRaining && happy ? "It is not raining and we're happy" : "It is raining or we're not happy");
			System.out.println(!isRaining && !happy ? "It is not raining and we're not happy" : "It is raining or we're happy");

	}

}
