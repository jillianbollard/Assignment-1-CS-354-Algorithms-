public class FullSearchAlgs {
    // linear search function
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


    // binary search function
    public static int binary_search(int[] file_numbers, int input_num){
        // sort the file_numbers list with nested for loop
        for (int i = 0; i < file_numbers.length - 1; i++){

            // nest second for loop
            for (int j = i + 1; j < file_numbers.length; j++){

                // check to see if out of order, if so switch values 
                if(file_numbers[i] > file_numbers[j]){

                    // swap numbers position
                    int temp = file_numbers[i];
                    file_numbers[i] = file_numbers[j];
                    file_numbers[j] = temp;

                } // end if
            } // end nested
        } // end outer loop

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
                right = middle_index;
            }
            
            else{
                // larger than middle value
                left = middle_index;
            }
        }

        // return the -1 if value was not found in for loop
        return -1;
    }


    // random search function *add catch all if the function terminates after 10M searches returning the value -2*
    public static int random_search(int[] file_numbers, int input_num){
        // initalize the default return val to not found
        int return_val = -1;

        // implement random search method


        // make catch call where the function terminates and sets the return_val to -2
        return_val = -2;

        // return the final value if found with random search, terminated, or not found
        return return_val;
    }
}
