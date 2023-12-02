package patterns;

import java.util.Scanner;

public class charTriangleP2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 1;
        while(i <= n){
            int j = 1;
            char ch = (char)('A' + i - 1);
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
