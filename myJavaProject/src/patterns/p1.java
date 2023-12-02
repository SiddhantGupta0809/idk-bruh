package patterns;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 1;


        while(i <= n){
            int j = 1;
            int val = i;
            while(j <= i){
                System.out.print(val + " ");
                val++; j++;
            }
            i++;
            System.out.println();
        }
    }
}
