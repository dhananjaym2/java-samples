/**
 * Program to start counting from 1 up-to the input number and print following according to each counter number.
 *
 *|==========|==========================|
 *| PRINT    | IF NUMBER IS MULTIPLE OF |
 *|----------|--------------------------|
 *| FizzBuzz | 3 and 5                  |
 *| Fizz     | 3                        |
 *| Buzz     | 5                        |
 *|==========|==========================|
 *
**/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class FizzBuzz {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        int numOfTestCases = s.nextInt();                 // Reading input from STDIN
        //System.out.println("numOfTestCases: " + numOfTestCases);    // Writing output to STDOUT

	int [] inputArray = new int[numOfTestCases];
	for (int i = 0; i < inputArray.length; i++) {
		inputArray[i] = s.nextInt();
	}

	for (int i = 0; i < inputArray.length; i++) {
		for (int j = 1; j <= inputArray[i]; j++) {

				if (j % 3 == 0 && j % 5 == 0)
					System.out.println("FizzBuzz");
				else if (j % 3 == 0)
					System.out.println("Fizz");
				else if (j % 5 == 0)
					System.out.println("Buzz");
				else
					System.out.println(j);

		}
	}
    }
}//SELECT DISTINCT Sales.SalesPerson FROM Sales
