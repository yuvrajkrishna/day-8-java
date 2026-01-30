public class floydtriange {
    public static void FloydTriange(int n){
        int num =0;
        for(int i = 1; i<=n;i++){
            for(int j =0; j<i;j++){
                num+=1;
                System.out.print(num +" ");
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        FloydTriange(5);
    }
}
