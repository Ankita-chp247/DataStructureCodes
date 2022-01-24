
public class Quick   
	{  
		
	int part (int a[], int start, int end)  
	{  
	    int pivot = a[end]; // pivot element  
	    int i = (start - 1);  
	  
	    for (int j = start; j <= end - 1; j++)  
	    {  
	        // If current element is smaller than the pivot  
	        if (a[j] < pivot)  
	        {  
	            i++;                   // increment index of smaller element  
	            int t = a[i];  
	            a[i] = a[j];  
	            a[j] = t;  
	        }  
	    }  
	    int t = a[i+1];  
	    a[i+1] = a[end];  
	    a[end] = t;  
	    return (i + 1);  
	}  
	
	void quick(int a[], int start, int end)         // function to implement quick sort  
	{  
	    if (start < end)  
	    {  
	        int p = part(a, start, end);  //p is part index  
	        quick(a, start, p - 1);  
	        quick(a, p + 1, end);  
	    }  
	}  
	  
	 
	void printArr(int a[], int n)  //function to print an array
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");  
	}  
	    public static void main(String[] args) {  
	    int a[] = { 23,33,75,64,21,43 };  
	    
	    int n = a.length;  
	    System.out.println("\nBefore sorting array elements are - ");  
	    
	    Quick q1 = new Quick();  
	    q1.printArr(a, n);  
	    q1.quick(a, 0, n - 1);  
	    System.out.println("\nAfter sorting array elements are - ");  
	    q1.printArr(a, n);  
	    System.out.println();  
	    }  
	}  

