package functions;

import java.util.Scanner;

public class nChooseR {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int r = scan.nextInt();

        double result = (double)fac(n)/((fac(r)*fac(n-r)));
        System.out.println("Ans: " + result);
    }


    public static int fac(int a){
        int ans = 1;
        while(a > 0){
            ans *= a;
            a--;
        }
        return ans;
    }

}
