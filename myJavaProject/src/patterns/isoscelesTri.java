package patterns;

import java.util.Scanner;

public class isoscelesTri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 1;
        int nst = 1;
        while(i <= n){
            //spaces
            int j = 1;
            int nsp = n - i;
            while(j <= nsp){
                System.out.print("\t");
                j++;
            }

            j = 1;
            int val = 1;
            while(j <= nst){
                System.out.print(val + "\t");
                if(j <= nst/2){
                    val++;
                }else{
                    val--;
                }
                j++;
            }

            nst = nst + 2;
            System.out.println();
            i++;
        }
    }
}
