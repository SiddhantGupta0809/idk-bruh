package patterns;

public class squareP2 {
    public static void main(String[] args) {
        int n = 4;
        int i =1;
        while (i <= n){
            int j = 1;
            while(j <= n){
                System.out.print(j+"\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
