public class findNcr {
    public static int Factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static void Ncr(int n,int r){
        int factN=Factorial(n);
        int factR=Factorial(r);
        int factNR=Factorial(n-r);
        int binoCoeff = (factN)/(factR*factNR);
        System.out.println("Binominal Coefficient: "+ binoCoeff);
    }
    public static void main(String args[]){
        Ncr(5, 2);
    }
}
