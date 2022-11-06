/*
A program that displays the following pattern
    *
    **
    ***
    ****
    ***
    **
    *

*/

public class Pattern {
    static void pattern(){
        for (int i=0; i<4; i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    
        for (int x=3; x>=0; x--){
            for(int y=0; y<=x; y++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        pattern();
    }
}