/*
	To apply the method explained in the hint video, we have to add two more parameters in the function call. This can be done by calling a helper function from given function. The helper function can have three parameters: array, start index, end index.  
	
	Skeleton code to achieve this:
	public class Solution {
		public static void quickSort(int[] input, int startIndex, int endInedx) {
			// your code goes here
		}
	
		public static void quickSort(int[] input) {
			quickSort(input, 0, input.length - 1);
		}
	
	}
	
*/


public class Solution {
	
	public static void quickSort(int[] input) {
		quicksort(input, 0, input.length-1);
		
	}




	
	
    public static int partition(int a[], int pivot ,int si,int ei){
        int i=si; int j=si;
        while(i<=ei){
            
        
            if(a[i]>pivot){
                i++;
            }
            else{
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j++;
            }

        }
        return j-1;
	}

    public static void quicksort(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
		int pivot=a[ei];
        int p=partition(a,pivot,si,ei);
        
        quicksort(a,si,p-1);
        quicksort(a,p+1,ei);
    }
}

	
