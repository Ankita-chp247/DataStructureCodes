

class BinerySearch {
  static int binerySearch (int a[], int beg,int end, int val) 
  {
	  int mid;
	  if(end>=val)
	  {
		  mid=(beg+end)/2;
		  if(a[mid]== val)
		  {
			  return mid+1;
		  }
		  
		  else if(a[mid]< val) 
		  {
			  return binerySearch(a,mid+1,end,val);
		  }
		  
		  else {
			  return binerySearch(a,beg,mid-1,val);
		  }
	  }
	  return -1;
  }
  public static void main(String args[] ) {
	               
	  int a[] = {30,25,45,12,29,32};
	  int val= 25;
	  int n = a.length; //array size
	  int res = binerySearch(a, 0,n-1, val); // Store result
	  System.out.println();
	  System.out.print("The elements of the array are - ");  

	  for(int i =0; i< n; i++)
	  {
		  System.out.println(a[i]+"");
	  }
	  System.out.println();
      System.out.println("Element to be searched is: " + val);  

      if (res == -1)  
     {
      System.out.println("Element is not present in the array");  
  }  
      else{
    	  System.out.println("Element is present at " + res + " position of array");
      }
	    
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	               
	  
	  
	  
	  
  }
  
 }
  
