import pkg.*;
import java.util.*;

class starter {
	void bubbleSort(int arr[], int n)
	{
		int a, b; 
		for(a=0; a<n-1; a++)
		
		for(j=0; b<n-i-1; b++)
			if(arr[b] > arr[b+1])
				swap(&arr[b], &arr[b+1])
	}
	
	void selectionSort(int arr[], int a)
	{
		int b, c, min_idx;
		for(b=0; b<n-1; b++)
		{
		min_idx = b;
		for (j= b+1; b<n; b++)
		if (arr[j] < arr[min_idx])
			min_idx = c;
	}
	
	void insertionSort(int arr[], int n)
	{
		int a, key, b;
		for (a = 1; a<n; a++)
		{
			key = arr[i];
			b = a-1;
			while(a>=0 && arr[a] > key)
			{
				arr[a+1] = arr[a];
				a = a-1;
			}
			arr[a+1] = key;
		}
	}
}
