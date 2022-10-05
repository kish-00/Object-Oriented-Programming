/*
A program that displays prime numbers between 0 and 100

A prime number is a whole number greater than 1 divisible, without a remainder,  by only 1 and itself.
1 is not inclusive
*/

public class Prime {
    static void PrimeNo1to100(){
        int i, j;
        boolean isPrime;
        for (i=2;i<=100;i++){
            isPrime=true;
            for (j=2;j<i/2;j++){
                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        PrimeNo1to100();
    }
}
