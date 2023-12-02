package patterns;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int nst = 1, i = 1, nsp = n/2;

        while(i <= n){
            //spaces
            int j = 1;
            while(j <= nsp){
                System.out.print("\t");
                j++;
            }
            //stars
            j = 1;
            while(j <= nst){
                System.out.print("*\t");
                j++;
            }

            if(i <= n/2){
                nsp--;
                nst += 2;
            }else{
                nsp++;
                nst -= 2;
            }

            i++;
            System.out.println();
        }
    }
}
