package patterns;

import java.util.Scanner;

public class charTrinagleP3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 1;
        while(i <= n){
            int j = 1;
            char ch = (char)('A' + n - i);
            while(j <= i){
                System.out.print(ch + "\t");
                j++;
                ch++;
            }
            System.out.println();
            i++;
        }
    }
}
