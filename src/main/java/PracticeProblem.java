/* 
File: Lesson 2.1 - Methods
Author: Kaveeshan Sathasivam
Date Created: Mar 10, 2026
Date Last Modified: Mar 10, 2026

*/



public class PracticeProblem {

	public static void main(String args[]) {
		int result1 = sum(5, 7);
		int result2 = difference(5, 7);
		double result3 = product(5, 7);
		String result4 = removeFirst("Apple");
        

	}

	//Create your functions here
	public static int sum(int a,int b) {
		return a+b;	
	}
	public static int difference(int a,int b) {
		return a-b;	
	}
	public static double product(double a,double b) {
		return a*b;	
	}

	public static String removeFirst(String word) {
	return word.substring(1);
	
	
	}



}
