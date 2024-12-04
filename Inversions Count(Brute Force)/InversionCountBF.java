public class InversionCountBF {
    public static void main(String[] args) {
        int[] arr={3,4,2,6,7,8,24,6,}; // inversions would be- (3,2),(4,2),(7,6),(8,6),(24,6) 
        int n=arr.length;
        int count=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]) count++;
            }
        }
        System.out.println(count);
    }
}
//Time Complexity is O(n^2) which is not the best, But Space Complexity is best in this method i.e, O(1)