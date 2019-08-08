
    public class BS {
        public static void main(String[] args) {
            int[] num = new int []{2,3,5,4,1};

            for (int i = 0; i < (num.length-1); i++) {
                if (num[i]<num[i+1]){
                    System.out.println(num[i]);
                }else {
                    sort(num);
                    i = -1;
                }
            }

        }
        static void sort(int[]num1){
            for (int i = 0; i<(num1.length-1); i++) {
                if(num1[i]>(num1[i+1])){
                    int var = num1[i];
                    num1[i] = num1[i+1];
                    num1[i+1] = var;
                }
            }
        }
}
