public class p5 {
    public static void main(String[] args) {
        int n=p2.scan();
        for (int i = 0; i <n ; i++) {
            for (int j =n; j>i ;--j) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
