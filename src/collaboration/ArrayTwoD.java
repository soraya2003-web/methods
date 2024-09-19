package collaboration;

public class ArrayTwoD {
    public static void main(String[] args) {
        int[][] a = {{1, 4, 5}, {2, 5, 3}};
        System.out.println(a[0].length);
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}
