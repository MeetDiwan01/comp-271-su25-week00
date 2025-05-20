public class Realistic {



    /**
     * Scan the entire array to find its smallest value
     * @param arr int[] array to explore
     * @return int with the smallest value in array arr
     */

    public static int getSmallest(int [] arr){
        int result = 0;
        //Assume that the first element is the smallest
        int index_smallest = 0;
        //loop through the rest of the array to find something smaller
        for (int i = 0; i < arr.length; i++) {
            //check if current element at position [i] is smaller
            if (arr[i] < arr[index_smallest]) {

                index_smallest =i;
            }
            
        }
        return result;
    } //method used getSmallest
}