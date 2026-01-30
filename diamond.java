public class diamond {
    public static void Diamond(int n){
        for(int i = 0;i<n;i++){
            // spaces - left
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(Math.pow(2,i)+i);j++){
                System.out.print("*");
            }
            //  spaces - right
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        // for(int i = 0;i<n;i++){
        //     // spaces - left
        //     for(int j = n; j<=Math.pow(2,j)-1;j--){
        //         System.out.print("*");
        //     }
        //     //  spaces - right
           
        // }
        
    }
    public static void main(String[] args) {
        Diamond(4);   
    }
}
