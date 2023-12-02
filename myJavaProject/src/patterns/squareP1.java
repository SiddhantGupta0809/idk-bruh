package patterns;

public class squareP1 {
    public static void main(String[] args) {
        int n = 4, i = 1;

        while(i <= n){
            int j = 1;
            while(j <= n){
                System.out.print(i+"\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
