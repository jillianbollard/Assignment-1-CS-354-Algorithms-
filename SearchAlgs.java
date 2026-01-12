// written by Jillian Bollard for assignment #1

public class SearchAlgs{
    // main function for inputs and searches (will utilize helper class with full search methods)
    public static int main(int num, String method){

        // read the numbers in the given command line into a supporting data structure to be traversed



        // check for linear method input
        if(method == "linear"){
            // call linear search and return result
            return FullSearchAlgs.linear_search(num);
        }

        // check for binary method input
        else if(method == "binary"){
            // call binary search and return result
            return FullSearchAlgs.binary_search(num);
        }

        // check for random method input
        else if (method == "random"){
            // call random search and return result
            return FullSearchAlgs.random_search(num);
        }
    } 
} 