public class butterfly {
    public static void Butterfly(int n){
        for(int i = 0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }

            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }


            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }


       for(int i =0 ;i<n;i++){

        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }

        for(int j=0;j<=i;j++){
            System.out.print(" ");
        }

        for(int j=0;j<=i;j++){
            System.out.print(" ");
        }

        for(int j=0;j<n-i;j++){
            System.out.print("*");
        }

        System.out.println();

       }
         
        
    }
    public static void main (String args []){
        Butterfly(4);
    }
}
