package hackerrank;

public class UtopianTree {
    public static int utopianTree(int n) {
        int height = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                height *= 2;
            } else {
                height += 1;
            }
        }
        return height;
    }
}
