/*
A program that computes the sum of even digits of any input integer
*/

import java.util.Scanner;

public class Sum{
    //method to convert integer to an array of integers.
    static int[] intToArray(int num){
        int len = Integer.toString(num).length();
        int[] numArray = new int[len];
        for(int i=0; num!=0;i++) {
            numArray[len-i-1]=num%10;
            num=num/10;
        }
        return numArray;
    }

    //method to sum up even numbers in an array
    static int evenSum(int[] numArray){
        int sum = 0;
        for (int j : numArray) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        //read the integer input
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        //convert the integer to an array. sum up the even digits in the array
        int ans = evenSum(intToArray(in));
        System.out.print("The sum of the even digits in "+in+" is: "+ans);
    }
}