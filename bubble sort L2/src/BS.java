
public class BS {
    public static void main(String[] args) {

        int[] num = new int[]{2, 3, 5, 4, 1, 6, 9, 10, 8, 7};

        sort(num);
        System.out.println(search(num, 11));
    }

    static void sort(int[] num2) {
        for (int i = 0; i < (num2.length - 1); i++) {
            if (num2[i] < num2[i + 1]) {
                System.out.println(num2[i]);
            } else {
                int var = num2[i];
                num2[i] = num2[i + 1];
                num2[i + 1] = var;
                i = -1;
            }
        }
    }

   public static int search (int[] array, int b) {
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int point = min + (max - min) / 2;
            if (b < array[point]) {
                max = point - 1;
            } else if (b > array[point]) {
                min = point + 1;
            } else {
                return point;
            }
        }
        return-1;
    }
}

