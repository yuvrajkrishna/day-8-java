public class zeroonetriange {
    public static void ZeroOneTriange(int n){
        int val = 0;
        for(int i = 1; i <= n; i++){
            for(int j=1;j<=i;j++){
                if(val == 0){
                    System.out.print(1 + " ");
                    val =1;

                }
                else{
                    System.out.print(0 + " ");
                    val = 0;
                }
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        ZeroOneTriange(5);
    }
}
