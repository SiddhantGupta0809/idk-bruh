package patterns;

import java.util.Scanner;

public class starPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 1;
        while(i <= n){

            int nsp = n - i;
            int j = 1;
            while(j <= nsp){
                System.out.print(" ");
                j++;
            }

            int ns = 2*i-1;
            j = 1;
            while(j <= ns){
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
