package patterns;

import java.util.Scanner;

public class triangleP4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 1;
        while(i <= n){
            int val = i;
            int j = 1;
            while(j <= i){
                System.out.print(val + "\t");
                j++;
                val--;
            }
            System.out.println();
            i++;
        }
    }
}
