public class binnaryToDecimal {
    public static int Power(int n,int pow){
        int temp=1;
        for(int i=1; i<=pow; i++){
            temp = temp*n;
        }
        return temp;
    }
    public static int Convert(int num){
        int pow=0;
        int decimal=0;
        while(num>0){
            int ld=num%10;
            decimal = decimal + (ld * Power(2,pow));
            pow++;
            num=num/10;
        }
        return decimal;
    }
    public static int optimalMethod(int num){
        int deciaml = 0;
        int power = 1;
        while(num>0){
            int lastDigit = num%10;
            deciaml += lastDigit * power;
            power *= 2;
            num/=10;
        }
        return deciaml;
    }
    public static void main(String args[]){
        System.out.println(Convert(1000));
        System.out.println(optimalMethod(1000));
    }
}
