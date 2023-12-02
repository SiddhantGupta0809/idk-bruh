package patterns;

import java.util.Scanner;

public class revTriP2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 1;
        while(i <= n){

            int j = 1;
            while(j <= n - i + 1){
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
