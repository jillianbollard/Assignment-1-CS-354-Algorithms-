/**
 * The SearchAlgs class for Assignment #1
 * @author Jillian Bollard
 * 01/16/2026
 */

public class SearchAlgs{

    /**
    * The main function for SearchAlgs class (CS 354 Assignment #1)
    * Takes two inputs of a desired number to find within a given list of integers as well as the type of function wanting to be used as the search method
    * The function will read in all the integers into the file_numbers object and then discern the type of search method through if statements then run the corresponding method from the FullSearchAlgs class
    * 
    * @param args - the String[] list where all parameters are listed within and retrieve to store in variables with bracket notation
    * @return nothing (void method)
    */
    public static void main(String[] args){
        // grab and store args values but case to ints for later comparison
        int num = Integer.parseInt(args[0]); 
        String method = args[1];

        // read the numbers in the given command line into a supporting data structure to be traversed
        int[] file_numbers = StdIn.readAllInts();

        // check for linear method input
        if(method.equals("linear")){
            // call linear search and return result
            System.out.println(FullSearchAlgs.linear_search(file_numbers, num)); 
        }

        // check for binary method input
        else if(method.equals("binary")){
            // call binary search and return result
            System.out.println(FullSearchAlgs.binary_search(file_numbers, num));
        }

        // check for random method input
        else if (method.equals("random")){
            // call random search and return result
            System.out.println(FullSearchAlgs.random_search(file_numbers, num));
        }
    } 
} 