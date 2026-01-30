public class hollowRhombus {
    public static void HollowRhombus(int totalrows,int totalcols){
        for(int i = 1; i<=totalrows;i++){
            for(int j=1;j<=totalrows-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=totalcols;j++){
                if(j==1 || j==totalcols || i==totalrows || i==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HollowRhombus(5,5);
    }
}
