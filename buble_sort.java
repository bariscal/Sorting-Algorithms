package sorting_algorithms;

import java.util.Arrays;

/*

INPUTS:
 
 	int[] test_array_1 = {3,4,2,5};
	int[] test_array_2 = {5,11,45,9,6,7,8,1};
	int[] test_array_3 = {9,47,56,87,13,48,12,86};
	int[] test_array_4 = {150,85,95,74,12,8,4,6,85,47,8};
	int[] test_array_5 = {78,1000,96485,745818,8949,4594,9,459,4984,94,94,949};
	int[] test_array_6 = {4,56,6,84,68,4,541,6,84,684,6,54,14,8,6,14581,5,15,51,58,4,5};
	
OUTPUTS:

	Test Case 1: [2, 3, 4, 5]
	Test Case 2: [1, 5, 6, 7, 8, 9, 11, 45]
	Test Case 3: [9, 12, 13, 47, 48, 56, 86, 87]
	Test Case 4: [4, 6, 8, 8, 12, 47, 74, 85, 85, 95, 150]
	Test Case 5: [9, 78, 94, 94, 459, 949, 1000, 4594, 4984, 8949, 96485, 745818]
	Test Case 6: [4, 4, 4, 5, 5, 6, 6, 6, 6, 8, 14, 15, 51, 54, 56, 58, 68, 84, 84, 541, 684, 14581]

 
 
 */

public class buble_sort {

	public static int[] buble_sort(int[] array) {
		
		int n = array.length;
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(array[j] > array [j+1]) {
					int temp = array[j];
					array[j] = array[j+1]; //swap
					array[j+1] = temp;
					
				}
			}
		
		}
		return array;
		
	}
	
	public static void main(String[] args) {
		int[] test_array_1 = {3,4,2,5};
		int[] test_array_2 = {5,11,45,9,6,7,8,1};
		int[] test_array_3 = {9,47,56,87,13,48,12,86};
		int[] test_array_4 = {150,85,95,74,12,8,4,6,85,47,8};
		int[] test_array_5 = {78,1000,96485,745818,8949,4594,9,459,4984,94,94,949};
		int[] test_array_6 = {4,56,6,84,68,4,541,6,84,684,6,54,14,8,6,14581,5,15,51,58,4,5};
		
		System.out.println("Test Case 1: " + Arrays.toString(buble_sort(test_array_1)));
		System.out.println("Test Case 2: " + Arrays.toString(buble_sort(test_array_2)));
		System.out.println("Test Case 3: " + Arrays.toString(buble_sort(test_array_3)));
		System.out.println("Test Case 4: " + Arrays.toString(buble_sort(test_array_4)));
		System.out.println("Test Case 5: " + Arrays.toString(buble_sort(test_array_5)));
		System.out.println("Test Case 6: " + Arrays.toString(buble_sort(test_array_6)));

	}
	
}
