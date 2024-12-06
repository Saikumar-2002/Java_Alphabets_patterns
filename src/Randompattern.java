public class Randompattern {
    public static void main(String[] args) {

        int n = 11;

        System.out.println( );
        System.out.println( );
        for(int i = 0; i < n; i++)
        {

            //I
            for(int j = 0; j < n; j++){
                if (i==0 || i==n-1 || j == (n-1)/2 && i >0 && i< n-1) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //adding some more space between the I and L
            System.out.print(" ");System.out.print(" ");System.out.print(" ");


            // L
            for(int j = 0; j < n; j++){
                if (j==0 || i ==n-1 && j>0) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //adding some more extra space
            System.out.print(" ");System.out.print(" ");System.out.print(" ");

            //O
            for(int j = 0; j < n; j++){
                if ( (j==0 && i > 0 && i < n-1 ) || ( i == n-1 && j > 0 && j < n-1) || (j==n-1 && i > 0 && i < n-1) || (i==0 && j > 0 && j < n-1) ) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            //adding some space
            System.out.print(" ");System.out.print(" ");System.out.print(" ");


            //V
            for(int j = 0; j < n; j++){
                if ((j==0 && i < (n-1)/2 ) || (i - j == (n-1)/2) || (i + j == (n-1)+ (n-1)/2) || (j==n-1 && i < (n-1)/2)) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //adding some space
            System.out.print(" ");System.out.print(" ");System.out.print(" ");
            //E
            for(int j = 0; j < n; j++){
                if ((j==0 ) || ( i== 0 && j > 0) || ( i == (n-1)/2 && j > 0) || ( i== n-1 && j > 0)) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //adding some space
            System.out.print(" ");System.out.print(" ");System.out.print(" ");


            //Y
            for(int j = 0; j < n; j++){
                if ( (i==j && i < (n-1)/2) || (i + j == n-1 && i < (n-1)/2) || (j==(n-1)/2 && i >= (n-1)/2) ) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            //ading some space

            System.out.print(" ");System.out.print(" ");System.out.print(" ");

            //O
            for(int j = 0; j < n; j++){
                if ((j== 0 && i > 0 && i < n-1) || ( i == n-1 && j > 0 && j < n-1) || (j==n-1 && i > 0 && i < n-1) || ( i == 0 && j > 0 && j < n-1)) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //adding some space
            System.out.print(" ");System.out.print(" ");System.out.print(" ");

            //U
            for(int j = 0; j < n; j++){
                if ( ( j == 0 && i < n-1) || ( i == n-1 && j > 0 && j < n-1) || ( j == n-1 && i < n-1)) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();
        System.out.println( );



    }
}
