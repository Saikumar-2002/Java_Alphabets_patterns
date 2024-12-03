public class PatternK {
    public static void main(String args[]){
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((j==(n-1)/2&&i<n)||(i+j==n-1&&i<(n)/2)||(i==j&&i>n/2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
