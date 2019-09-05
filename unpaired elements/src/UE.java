public class UE {
    public static void main(String[] args) {
        int[]array = new int[]{1, 2, 3, 1, 3, 2, 3};
        System.out.println(unPaired(array));
    }
    static int unPaired (int[]arr) {
        int i = 0;
        int x = 0;
            for ( i = 0; i < (arr.length); i++) {
                x = x^arr[i];
            }
        return x;
    }

}