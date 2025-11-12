public class hollowRhombus {
  public static void main(String[] args) {
    int n=5;
    for(int i=1;i<=n;i++){
         for(int j=(n-i);j>=1;j--){
            System.out.print(" ");
        }
        if(i==1 || i==5){
            for(int j=1;j<=n;j++){
                System.out.print("*"+ " ");
            }
        }
        else{
            for(int j=1;j<=n;j++){
                if(j==1 || j==5){
                    System.out.print("*"+"    ");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
  }  
}
