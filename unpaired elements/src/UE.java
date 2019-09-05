public class UE {
    public static void main(String[] args) {
        int[]array = new int[]{1, 2, 3, 1, 3, 2, 3};
        System.out.println(unPaired(array));
    }
    static int unPaired (int[]arr) {
        int i = 0;
        int x = arr[i] ^ arr[i + 1];
            for ( i = 1; i < (arr.length-1); i++) {
                x = x ^ arr[i + 1];
            }
        return x;
    }

}