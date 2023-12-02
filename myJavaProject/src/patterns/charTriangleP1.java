package patterns;

import java.util.Scanner;

public class charTriangleP1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 1;
        while(i <= n){
            char ch = 'A';
            int j = 1;
            while(j <= n){
                System.out.print(ch + "\t");
                ch++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
