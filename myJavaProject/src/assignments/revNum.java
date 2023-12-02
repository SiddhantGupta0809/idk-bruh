package assignments;

import java.util.Scanner;

public class revNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter 'a' to exit: ");
        char ch = ' ';
        while(ch != 'a'){
            int n = scan.nextInt();
            int revNum = 0;

            int t = n;
            while(t != 0){
                int digit = t % 10;
                revNum = revNum + digit;
                revNum = revNum * 10;
                t /= 10;
            }
            System.out.println(revNum/10);
            System.out.println("Enter 'a' to exit: ");
            ch = scan.next().charAt(0);
        }

    }
}
