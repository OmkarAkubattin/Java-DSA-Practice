public class invertedHalfPyramidNumber {
    public static void printPyramid(int m,int n){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
     public static void main(String args[]){
        printPyramid(5, 5);
    }
}
