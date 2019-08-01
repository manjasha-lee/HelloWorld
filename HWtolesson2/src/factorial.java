public class factorial {

        public static void main(String[] args) {
            int n;
            n = fact(5);
            System.out.println(n);
        }
        static int fact (int var){
            int result = 0;
            for (int i = 1; i > var; i++) {
                result = (var - (var - i))*(var -(var - (i + 1)));
            }
            return result;
        }


}
