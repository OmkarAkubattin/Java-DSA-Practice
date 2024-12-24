public class butterflyPattern {
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(' ');
            }
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.err.println();
        }
        printPatternRevese(n);
    }
    public static void printPatternRevese(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(' ');
            }
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.err.println();
        }
    }
    public static void main(String args[]){
        printPattern(3);
    }
}
