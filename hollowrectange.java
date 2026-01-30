public class hollowrectange{
    public static void HollowRectange(int totalrows,int totalcols){
        // outer loop - rows
        for(int i = 1; i <=totalrows;i++){
            // inner - columns
            for(int j =1 ;j<=totalcols;j++){
                // cell (i,j)
                if(i == 1 || j == 1 || i== totalrows || j == totalcols){
                    // boundary cells
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main (String args []){
        HollowRectange(4,7);
    }
}