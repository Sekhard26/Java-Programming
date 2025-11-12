import java.util.Arrays;

public class u {
    public static int[] remove(int arr[]) {
        
        int temp[]= new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            boolean isUniq= true;
            for(int j=0;j<i;j++){
                if( arr[i]==arr[j]){
                    isUniq= false;
                    break;
                }
            }
                if(isUniq){
                    temp[count]=arr[i];
                    count++;
                }
                
            
        }
            int result[]= new int[count];
            for(int j=0;j<result.length;j++){
                result[j]= temp[j];
            }
            
        
        return result;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5};
        int u[]= remove(arr);
        System.out.print(Arrays.toString(u));
    }
}