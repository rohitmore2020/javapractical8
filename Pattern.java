public class Pattern {
    public void space(int n) {
        if (n == 0) return;
        System.out.print(" ");
        space(n - 1);
    }

    public void stars(int n) {
        if (n == 0) return;
        System.out.print("*");
        stars(n - 1);
    }

    public void printStars(int n, int maxSize) {
        if (n > maxSize) return;
        
        space(maxSize - n);
        stars(2 * n - 1);
        System.out.println();
        
        printStars(n + 1, maxSize);
        
        if (n != maxSize) {
            space(maxSize - n);
            stars(2 * n - 1);
            System.out.println();
        }
    }

    public void plus(int n, int spaces) {
        if (n == 0) return;
        space(spaces);
        System.out.println("+");
        plus(n - 1, spaces);
    }

    public void print(int size) {
        int maxStars = (size + 1) / 2;
        printStars(1, maxStars);
        plus(size, maxStars - 1);
    }

    public static void main(String[] args) {
        Pattern p = new Pattern();
        p.print(5);
    }
}
