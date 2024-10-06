package qw;

public class A {
    public static void main(String[] args) {
        String[] k = getK();
        String[] h = getH();
        String[] u = getU();
        String[] s = getS();
        String[] v = getV();
        String[] a = getA();
        String[] n = getN();
        String[] t = getT();
        
        // Print the letters side by side
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i] + "   " + h[i] + "   " + u[i] + "   " + s[i] + "   " + h[i] + "   " + v[i] + "   " + a[i] + "   " + n[i] + "   " + t[i]);
        }
    }

    public static String[] getK() {
        return new String[]{
                "*     *",
                "*    * ",
                "*   *  ",
                "****   ",
                "*   *  ",
                "*    * ",
                "*     *"
        };
    }

    public static String[] getH() {
        return new String[]{
                "*   *",
                "*   *",
                "*   *",
                "*****",
                "*   *",
                "*   *",
                "*   *"
        };
    }

    public static String[] getU() {
        return new String[]{
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    public static String[] getS() {
        return new String[]{
                " *** ",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                " *** "
        };
    }

    public static String[] getV() {
        return new String[]{
                "*   *",
                "*   *",
                "*   *",
                " * * ",
                " * * ",
                "  *  ",
                "  *  "
        };
    }

    public static String[] getA() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*****",
                "*   *",
                "*   *",
                "*   *"
        };
    }

    public static String[] getN() {
        return new String[]{
                "*   *",
                "**  *",
                "* * *",
                "*  **",
                "*   *",
                "*   *",
                "*   *"
        };
    }

    public static String[] getT() {
        return new String[]{
                "*****",
                "  *  ",
                "  *  ",
                "  *  ",
                "  *  ",
                "  *  ",
                "  *  "
        };
    }
}
