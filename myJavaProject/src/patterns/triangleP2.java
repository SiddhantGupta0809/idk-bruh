package patterns;

import java.util.Scanner;

public class triangleP2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 1;
        while(i <= n){
            int j = 1;
            int val = i;
            while(j <= i){
                System.out.print(val + "\t");
                j++;
                val++;
            }
            System.out.println();
            i++;
        }
    }
}
