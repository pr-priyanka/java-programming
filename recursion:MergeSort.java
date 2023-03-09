public class solution {

	public static void merge(int[]b,int[]c,int[]a){
        int i=0;
        int j=0;
        int k=0;
        while(i<b.length && j<c.length){
            if(b[i]<=c[j]){
                a[k]=b[i];
                i++;
                k++;
            }else{
                a[k]=c[j];
                k++;
                j++;
            }
        }
        if(i<b.length){
            while(i<b.length){
                a[k]=b[i];
                i++;
                k++;
            }
        }
        if(j<c.length){
            while(j<c.length){
                a[k]=c[j];
                k++;
                j++;
            }
        }
    }

    public static void mergeSort(int arr[]){
        if(arr.length<=1){
            return;
        }
        int b[]=new int[arr.length/2];
        int c[]=new int[arr.length-b.length];
        for(int i=0;i<arr.length/2;i++){
            b[i]=arr[i];
        }
        for(int i=arr.length/2;i<arr.length;i++){
            c[i-arr.length/2]=arr[i];
        }
        mergeSort(b);
        mergeSort(c);
        merge(b,c,arr);
    }
    
