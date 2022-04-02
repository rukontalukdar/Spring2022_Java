package codetest;

    /**
     * Ques-1:
     * Create a method to return an int-array after sorting a given input-int-array
     * points: 10
     */

    import java.util.Arrays;
    import java.util.HashSet;

    public class codetest {

        // Main driver method
        public static void main(String[] args)
        {
            // Custom input array
            int[] arr = { 2, 7, 3, 4};

            // Applying sort() method over to above array
            // by passing the array as an argument
            Arrays.sort(arr);
            System.out.println(arr);



            /**
             * Ques-2:
             * Create a method to return the sum of digits in input-int-value
             * points: 20
             **
             *
             * eg:
             * input -> 123
             * returned value -> 6  (1 + 2 + 3)
             *
             * input -> 323
             * returned value -> 8  (3 + 2 + 3)
             *
             * input -> 90
             * returned value -> 9  (9 + 0)
             *
             * int result1 = addDigits(123);    // result1 = 6
             *
             * int result2 = addDigits(575);    // result2 = 17
             *
             *
             *
             */

    public class SumOfDigits {}
    static int findSum(int number) {
    int sum = 0;
    while (number != 0) {
        sum = sum + number % 10;
        number = number/10;}
    return;
    int numbers = 235;
    System.out.println(numbers);
        }


        /**
         * Ques-3:
         * Create a method to return an int-array after removing input-int-value from an input-int-array
         * points: 30
         */

    public class RemoveNumberFromArray {
        public static void main(String args[])
            int[] input = {42, 322, 22, 11, 22, 33, 16};




    /**
     * Ques-4:
     * Create a method to print the common Strings values in two input-String-arrays
     * points: 40
     * Note: two input-String-arrays can be of same size or different size
     */


public class ArrayCommon {
    public static void main(String[] args) {
        String[] array1 = {"Hi", "this", "is", "a", "test"};
        String[] array2 = {"this", "is", "test", "number", "two"};


        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));
        HashSet < String > set = new HashSet < String > ();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    set.add(array1[i]);
                    System.out.println("Common element : " + (set));
    }
}}}}}