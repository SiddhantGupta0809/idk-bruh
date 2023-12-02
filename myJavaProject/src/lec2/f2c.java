package lec2;

import java.util.Scanner;

public class f2c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int e = scan.nextInt();
        int st = scan.nextInt();

        while(s <= e){
            int c = (5*(s-32))/9;
            System.out.println(s + " " + c);
            s = s+st;
        }
    }
}
