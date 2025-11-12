public class sortedArray {
    public static boolean sort(int arr[], int idx) {
        if(idx==arr.length-1){
            
            return true;
        }
        
        if(arr[idx]>=arr[idx+1]){
            return false;
        }
        return sort(arr, idx+1);
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,4};
        if(sort(arr, 0))
        System.out.print("The array is sorted");
        else
        System.out.print("The array is not sorted");
    }
}
