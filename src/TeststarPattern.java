public class TeststarPattern {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0&&j<n)||(j==0&&i<(n-1))||(i+j==(n-1)/2)||(j-i==(n)/2)||(j==n-1&&i<n-1)||(i==n-1&&j<n)||(i-j==(n-1)/2)||(i+j==(n-1)+(n-1)/2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
