package com.jap.quicksort;

/* Write a program that stores 10 numbers in an array and sorts them by using the quick sort algorithm.
In addition, the program should also calculate the number of comparisons and the number of data movements.
 */
public class QuickSort {
    // Calculates number of comparisons done while sorting an array using quick sort
    static int numberOfComparisons = 0;
    // Calculates number of swaps while sorting an array using quick sort
    static int numberOfDataMovement = 0;

    public static void main(String[] args) {
        // Declare the array with the distances
        int[] integerArray = {138,52,118,136,85,276,103,87,214,101};
        QuickSort quickSort = new QuickSort();

        // Call method to sort array using quick sort
        int[] sortedArray = null;

		int n=integerArray.length;
		sortedArray = quickSort.sort(integerArray,0,n-1);
		

        // Display the sorted array
        System.out.println("The sorted distances are : ");

        // Display the numberOfComparisons and numberOfDataMovement
    }

    // Function recursively sorts elements before and after partition
    public int[] sort(int[] array, int start, int end) {

		QuickSort quickSort = new QuickSort();

		quickSort.swap(array,start,end);

		int [] array2 =new int[array.length];

		for (int i=0; i<array.length; i++)
		{
            array2[i]=array[i];
		}
		
        return array2;
    }

    /* Function takes last element as pivot, places the pivot element at its correct position in sorted array,
    and places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot */
    private int Partition(int[] array, int start, int end) {

		int pivot=array[end];
		int i=start-1;

		for (int j=start; j<end; j++)
		{
			if(array[j]<pivot)
			{
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		i++;
		int temp2=array[i];
		array[i]=pivot;
		array[end]=temp2;

        return i;
    }

    // Function swaps elements within array
    private void swap(int[] array, int index1, int index2) 
	{
		 QuickSort quickSort = new QuickSort();

      // write logic to swap the values

        if(index1<index2)
	    {
	        int pivIndex=quickSort.Partition(array,index1,index2);
	        swap(array, index1, pivIndex-1);
	        swap(array, pivIndex+1, index2);
	    }

    }
}
