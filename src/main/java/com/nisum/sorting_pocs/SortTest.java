package com.nisum.sorting_pocs;

public class SortTest {
	public static void main(String[] args) {
		int arr[] = { 5, 10, -5, 2, -4, 9, 1, 0, -3, 3 };

		
		//bubble sorting
		BubbleSort bubblesort = new BubbleSort();
		bubblesort.bubbleSorting(arr);
		
		//Selectionsort
		int selectionsort[] = { 50, 10, -20, 2, 4, 0, -2, 8, -3, 8 };
		SelectionSort.selectionSort(selectionsort);
		
		//insertonsort
		int[] insertionsort={ 10, -10, -20, 5, 6, 2, 0, 90 -9, 4 };
		InsertionSort.insertionSort(insertionsort);
	}
}
