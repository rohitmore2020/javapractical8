public class pattern2{

    public void space(int n) {
        if (n == 0) return;
        System.out.print(" ");
        space(n - 1);
    }

    public void stars(int n, int size) {
        if (n == 0) return;
        stars(n - 1, size);
        space(size - n);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void middle(int size) {
        for (int i = 0; i < size + 1; i++) {
            System.out.print("+");
        }
        System.out.println();
    }

    public void slash(int n, int size) {
        if (n == 0) return;
        space(size - n);
        for (int i = 0; i < n; i++) {
            System.out.print("/");
        }
        System.out.println();
        slash(n - 1, size);
    }

    public void print(int size) {
        stars(size, size);
        middle(size);
        slash(size, size);
    }

    public static void main(String[] args) {
        pattern2 p = new pattern2();
        p.print(3);
    }
}
