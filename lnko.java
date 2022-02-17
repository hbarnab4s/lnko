public class lnko {
    public static void main(String args[]) {
        int a = 24;
        int b = 5;
        System.out.println(lnko(a, b));
    }

    private static int lnko(int a, int b) {
        int q = a/b;
        int r = a - q*b;
        if (r<1) {
            return b;
        }
        System.out.printf("%d = %d*%d + %d%n", a, a/b, b, a%b);
        return lnko(b, r);
    }
}
