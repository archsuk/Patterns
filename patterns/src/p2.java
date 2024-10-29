import java.util.Scanner;

public class p2 {
   static int scan(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        return n;
    }

    public static void main(String[] args) {
        int n = scan();
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
