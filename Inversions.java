public class Inversions {
    public static int count(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 5, 4};
        System.out.println("Number of inversions: " + count(a));
    }
}
