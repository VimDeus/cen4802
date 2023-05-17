package com.fiboassignment.gavinluna;

public class Fibonacci {
    
	/**
    * An array to store the computed Fibonacci numbers. Used to check against already computed numbers and improve efficiency.
    */
    private static int[] memo;

    
    /**
     * This method Calculates the nth term of the Fibonacci sequence.
     *
     * @param n The term to calculate.
     * @return The nth term of the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if(memo[n] != 0) {
            return memo[n];  // Returns the stored result
        }
        if(n <= 1) {
            return n;
        } else {
            memo[n] = fibonacci(n - 1) + fibonacci(n - 2);  // Compute and store the result recursively.
            return memo[n];
        }
    }

    
    /**
     * The main method.
     * 
     * Calls the fibonacci method to calculate the 10th term of the Fibonacci sequence 
     * and prints the result.
     *
     * @param args Command-line arguments (ignored).
     */
    public static void main(String[] args) {
        int term = 10;
        
        // Initialize the memoization array.
        memo = new int[term + 1]; 
        
        // Calculate the 10th term of the Fibonacci sequence.
        int result = fibonacci(term); 
        
        
        // Print the result.
        System.out.println("The " + term + "th term of the Fibonacci sequence is " + result + ".");
    }
}
