public class invertedRotatedHalfPyramid {
    public static void printPyramid(int toRows,int toCols){
        for(int i=1;i<=toRows;i++){
            for(int j=1;j<=toCols-i;j++){
                System.err.print(' ');
            }
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        printPyramid(4,4);
    }
}
