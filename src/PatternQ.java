public class PatternQ {
    public static void main(String args[]){
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0&&j<n)||(j==0&&i<n)||(j==n-1&&i<n)||(i==n-1&&j<n)||(i==j&&j>(n-1)/2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
