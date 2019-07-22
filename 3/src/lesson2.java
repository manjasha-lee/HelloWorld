public class lesson2 {
    public static void main(String[] args) {
        factorial(2);


    }
    public static void factorial(int b){
        int[] num = new int[b+1];
        int i;
        int f;
    for (i=1;i>b;i++){
        f = i*i++;
        System.out.println(f);
        for (int i1 : num) {
            System.out.println(f);
        }
    }

    }

}


