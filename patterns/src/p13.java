public class p13 {
    public static void main(String[] args) {
        int n = p2.scan();
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
}
