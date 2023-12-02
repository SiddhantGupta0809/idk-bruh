package assignments;

import java.util.Scanner;

public class allPrimeTillN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 2; i <= n; i++){
            boolean isPrime = true;
            int j = 2;
            while(j <= i-1){
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if(isPrime) {
                System.out.print(i + "\t");
            }

        }
    }
}
