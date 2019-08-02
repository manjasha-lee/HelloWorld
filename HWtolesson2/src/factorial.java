public class factorial {

    public static void main(String[] args) {
        int i;
        i = fact(-5);
        System.out.println(i);
    }

    static int fact(int var) {
        if (var <= 1) {
            return 1;
        } else {
            return var * fact(var - 1);
        }
    }

}