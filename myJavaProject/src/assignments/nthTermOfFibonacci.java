package assignments;

import java.util.Scanner;

public class nthTermOfFibonacci {
    public static void main(String[] args) {
        //f1 = f2 = 1
        Scanner scan = new Scanner(System.in);
        int first =1, second =1, next = 0;
        int n = scan.nextInt();

        for(int i = 3; i <= n; i++){
            next = first + second;
            first = second;
            second = next;
        }

        System.out.println("nth term is: " + next);
    }
}
