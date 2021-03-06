
public class HeapSort {
	static void heapify(int a[], int n, int i)  
	{  
	    int largest = i; // initialize largest as root  
	    int left = 2 * i + 1; // left child  
	    int right = 2 * i + 2; // right child  
	    
	    
	    // If left child is larger than root  
	    if (left < n && a[left] > a[largest])  
	        largest = left;  
	    // If right child is larger than root  
	    if (right < n && a[right] > a[largest])  
	    	
	           largest = right;  
	  
	    if (largest != i) {  
	        // swap a[i] with a[largest]  
	    	
	        int temp = a[i];  
	        a[i] = a[largest];  
	        a[largest] = temp;  
	          
	        heapify(a, n, largest);  
	    }  
	}  
	//Function to implement the heap sort
	
	static void heapSort(int a[], int n)  
	
	{  
	    for (int i = n / 2 - 1; i >= 0; i--)  
	        heapify(a, n, i);  
	  
	    
	    
	    for (int i = n - 1; i >= 0; i--) {  
	        
	       int temp = a[0];  
	        a[0] = a[i];  
	        a[i] = temp;  
	          
	        heapify(a, i, 0);  
	    }  
	} 
	
	
	static void printArr(int a[], int n)  
	{  
	    for (int i = 0; i < n; ++i)  
	        System.out.print(a[i] + " ");  
	    
	}  
	public static void main(String args[])   
	
	{  
		
	    int a[] = {15,78,24,9,34,56};  
	    int n = a.length;  
	    System.out.print("Before sorting array elements are \n");  
	    printArr(a, n);  
	    heapSort(a, n);  
	    System.out.print("\nAfter sorting array elements are \n");  
	    printArr(a, n);  
	}  
	}  