package sorting_algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class selection_sort {

	public static int findIndex(int array[], int t){

        if (array == null) {
            return -1;
        }
        int n = array.length;
        int i = 0;
 
        // traverse in the array
        while (i < n) {
            if (array[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
	

		public static int[] removeTheElement(int[] array, int index) { 

			if (array == null || index < 0 || index >= array.length) { 
				return array; 
			} 
			
			int[] anotherArray = new int[array.length - 1]; 

			for (int i = 0, k = 0; i < array.length; i++) { 
				if (i == index) { 
					continue; 
				} 

				anotherArray[k++] = array[i]; 
			} 

			return anotherArray; 
		} 

		
	
	public static int[] selection(int[] array) {
		
		int n = array.length;
		int[] new_array = new int[n];
			
		
		for(int i = 0; i <= n-1; i++) {
			int array_min = Arrays.stream(array).min().getAsInt();
			int array_min_index = findIndex(array, array_min);
			new_array[i] = array_min;
			array = removeTheElement(array, array_min_index);
		}
		
		return new_array;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] test_array_1 = {3,4,2,5};
		int[] test_array_2 = {5,11,45,9,6,7,8,1};
		int[] test_array_3 = {9,47,56,87,13,48,12,86};
		int[] test_array_4 = {150,85,95,74,12,8,4,6,85,47,8};
		int[] test_array_5 = {78,1000,96485,745818,8949,4594,9,459,4984,94,94,949};
		int[] test_array_6 = {4,56,6,84,68,4,541,6,84,684,6,54,14,8,6,14581,5,15,51,58,4,5};
		
		System.out.println("Test Case 1: " + Arrays.toString(selection(test_array_1)));
		System.out.println("Test Case 2: " + Arrays.toString(selection(test_array_2)));
		System.out.println("Test Case 3: " + Arrays.toString(selection(test_array_3)));
		System.out.println("Test Case 4: " + Arrays.toString(selection(test_array_4)));
		System.out.println("Test Case 5: " + Arrays.toString(selection(test_array_5)));
		System.out.println("Test Case 6: " + Arrays.toString(selection(test_array_6)));
		
		
	}

}
