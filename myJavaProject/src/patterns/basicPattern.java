package patterns;

import java.util.Scanner;

public class basicPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("press a to exit: ");
        char ch = scan.next().charAt(0);
        while (ch != 'a'){
            System.out.println("Enter number of rows :");
            int n = scan.nextInt();
            int i = 1;
            while (i <= n){

                int j = 1;
                while(j <= n){
                    System.out.print("*\t");
                    j++;
                }

                System.out.println();
                i++;
            }
            System.out.println("press 'a' to exit:/ press any character to continue ");
            ch = scan.next().charAt(0);
        }

    }
}
