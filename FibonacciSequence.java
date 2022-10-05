/*
The Fibonacci series is a series of elements where, the previous two elements
are added to get the next element, starting with 0 and 1.
*/

//program to print the first 10 terms in the fibonacci sequence
//time complexity O(N)
public class FibonacciSequence {
    static void Fibonacci (){
        int num1=0, num2=1;
        for(int N=0; N<10; N++){
            //print the number
            System.out.print(num1+" ");

            //shift 1 step
            int num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }

    public static void main(String[] args) {
        Fibonacci();
    }
}
