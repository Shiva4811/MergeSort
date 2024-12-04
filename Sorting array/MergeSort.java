//Divide and Conquere technique
public class MergeSort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] c){
            int i=0, j=0, k=0;
            while(i<a.length && j<b.length){
                if(a[i]<=b[j]){
                    c[k]=a[i];
                    i++;
                    k++;
                }
                else{
                    c[k]=b[j];
                    j++;
                    k++;
                }
            }
            if(i==a.length){
                while(j<b.length){
                        c[k]=b[j];
                        j++;
                        k++;
                }
            }
            else{
                while(i<a.length){
                    c[k]=a[i];
                    i++;
                    k++;
            }
            }
    }
    public static void mergeSort(int[] arr){
        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];               //Divide the array in two parts
        int[] b=new int[n-n/2];
        for(int i=0; i<a.length; i++){
            a[i]=arr[i];
        }
        for(int i=0; i<b.length; i++){
            b[i]=arr[i+n/2];
        }
        mergeSort(a);
        mergeSort(b);

        merge(a, b, arr);
    }
    public static void main(String args[]){
        int[] arr={40,12,23,46,80,34,56,23};
        print(arr);
        mergeSort(arr);
        print(arr);
    }
}
