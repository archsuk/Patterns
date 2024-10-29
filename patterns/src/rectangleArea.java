import java.util.Scanner;

public class rectangleArea {
    static long area(long l , long b){
        long a;
        a = b * l;
        return a;
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        long l = s.nextLong();
        long b = s.nextLong();
        System.out.println(area(l,b));
    }
}
