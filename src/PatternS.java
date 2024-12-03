public class PatternS {
    public static void main(String args[]){
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0&&j<n)||(j==0&&i<n/2)||(i==n/2&&j<n)||(j==n-1&&i>n/2)||(i==n-1&&j<n))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
