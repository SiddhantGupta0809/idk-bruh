package patterns;

public class squareP3 {
    public static void main(String[] args) {
        int n = 4;
        int i =1;
        while (i <= n){
            int j = 1;
            while(j <= n){
                System.out.print((n-j+1)+"\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
