package lec2;

import java.util.Scanner;

public class add2num {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        int j = scan.nextInt();

        int k = i + j;
        System.out.println("sum is : " + k);
    }
}
