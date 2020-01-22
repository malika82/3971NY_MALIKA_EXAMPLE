package math.problems;

public class PrimeNumber {

    public static  boolean isPrime(int num) {
        int count=0;

        for (int i=1;i<=num;i++) {
            if (num%i==0)
            {
                count=count+1;
            }

        }
        if (count!=2)
            return false;
        else
            System.out.print(num+" ");
        return true;
    }

    public static void main(String[] args) {
        int n=100;
        for(int i=1;i<=n;i++){
            PrimeNumber.isPrime(i);
        }
    }
}
