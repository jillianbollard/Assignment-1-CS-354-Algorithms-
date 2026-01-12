// written by Jillian Bollard for assignment #1

public class SearchAlgs{
    // main function for inputs and searches (will utilize helper class with full search methods)
    public static void main(int num, String method){

        // read the numbers in the given command line into a supporting data structure to be traversed
        int[] file_numbers = StdIn.readAllInts();

        // check for linear method input
        if(method == "linear"){
            // call linear search and return result
            System.out.println(FullSearchAlgs.linear_search(file_numbers, num)); 
        }

        // check for binary method input
        else if(method == "binary"){
            // call binary search and return result
            System.out.println(FullSearchAlgs.binary_search(file_numbers, num));
        }

        // check for random method input
        else if (method == "random"){
            // call random search and return result
            System.out.println(FullSearchAlgs.random_search(file_numbers, num));
        }
    } 
} 