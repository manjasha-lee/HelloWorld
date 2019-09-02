public class UE {
    public static void main(String[] args) {
        int[]array = new int[]{4, 2, 3, 4, 3, 2, 3};
        sort(array);
        System.out.println(unPaired(array));
    }

    static void sort(int[] num) {
        for (int i = 0; i < (num.length - 1); i++) {
            if (num[i] < num[i + 1] || num[i] == num[i + 1]) {

            } else {
                int var = num[i];
                num[i] = num[i + 1];
                num[i + 1] = var;
                i = -1;
            }
        }
    }

    static int unPaired (int[]arr){
        for (int i = 0; i < arr.length; i+=2) {

            if (arr[i] == arr[i + 1]) {
            }else {
                return arr[i];
            }
        }
        return -1;
    }
}