public class factorial {

        public static void main(String[] args) {
            int n;
            n = fact(8);
            System.out.println(n);
        }
        static int fact (int var){
            int result = 1;
            for (int i = 1; i < var; i++) {
                result = result*(var-(var-(i+1)));
            }
            return result;
        }

}
