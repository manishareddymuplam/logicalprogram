package com.bridgelabz.logicalprogram;

public class FibonaciSeries {

	public static void main(String[] args) {
		int n=10, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonaci Series till " + n + " term:");
		
		for(int i = 1;i<= n; ++i) {
			System.out.println(firstTerm +", ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
