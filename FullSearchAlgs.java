/**
 * The FullSearchAlgs class for Assignment #1
 * @author Jillian Bollard
 * 01/16/2026
 */

public class FullSearchAlgs {

    /**
    * The linear search function for FullSearchAlgs class
    * Takes two inputs and searches through the file_numbers for a desired number by searching all file_number items linearly
    * If the function detects a match, it will return the index of the match in the file_numbers list
    * If no match is detected, the function will return -1 after searching all indexes in file_numbers
    *
    * @param file_numbers
    * @param input_num
    * @return index of where the value was found in the list, otherwise -1
    */

    public static int linear_search(int[] file_numbers, int input_num){

        // implement linear search method
        for (int i = 0; i < file_numbers.length; i++){

            // check to see if the search value matches the list value
            if(file_numbers[i] == input_num){
                // return the index of which the value was found
                return i;
            }
        }

        // if not found return -1 to symbolize not found
        return -1;
    }


    /**
    * The binary search function for FullSearchAlgs class
    * Takes two inputs and searches through the file_numbers for a desired number by searching all file_number items with binary search
    * The function will take the middle index of the sorted list and check if the input_num is larger, smaller, or a match
    * Once detecting if the input_num is higher or lower, the bound of the list will be adapted to the corresponding right or left side and the function will be run again
    * If a match is detected, the index of the match will be returned and -1 if the binary search list length becomes 0 without finding a match
    * 
    * @param file_numbers
    * @param input_num
    * @return index of where the value was found in the list, otherwise -1
    */

    public static int binary_search(int[] file_numbers, int input_num){
        // find inital indexes
        int left = 0;
        int right = file_numbers.length - 1;

        // implement binary search method
        while(left <= right){

            // find middle point
            int middle_index = (left + ((right - left) / 2));

            // check to see if middle number matches desired search value
            if(file_numbers[middle_index] == input_num){
                return middle_index;
            }

            // if no match, file down list to look within
            if(file_numbers[middle_index] > input_num){
                // smaller than middle value
                right = middle_index - 1;
            }
            else{
                // larger than middle value
                left = middle_index + 1;
            }
        }

        // return the -1 if value was not found in for loop
        return -1;
    }


    /**
    * The random search function for FullSearchAlgs class
    * Takes two inputs and searches through the file_numbers for a desired number by searching all file_number items randomly
    * The function will take a random index within the list and check to see if the item at that index matches the input_num
    * If the function finds a match while running- the index of the match will be returned, if no match is found after the function runs 10M times- -2 will be returned
    * 
    * @param file_numbers
    * @param input_num
    * @return index of where the value was found in the list, otherwise -2 if loop has run 10M times without finding a match
    */

    public static int random_search(int[] file_numbers, int input_num){
        // initalize while loop long varibale cunter for logic
        long counter = 0;

        // implement random search method
        while(counter < 10000000){
            // choose random index
            int rand_index = (int)(Math.random() * (file_numbers.length));

            // if it matches position return that index
            if(file_numbers[rand_index] == input_num){
                return rand_index;
            }

            // increment counter and repeat
            counter++;
        }

        // catch call if loop terminates after 10M runs it returns -2
        return -2;
    }
}
