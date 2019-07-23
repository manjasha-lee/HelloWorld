public class lesson2 {
    public static void main(String[] args) {
        factorial(2);


    }
    public static void factorial(int b){
        int[] numb = new int[b+1];
        int i;
        for (i = 1; i < numb.length; i++) {
        numb[i] = ++i;
        }
        int f = numb[1]*numb[2];
        int j;
        for (j = 3; j <numb.length; j++) {
           f=f*numb[j];
        }
        System.out.println(f);
        }


}


