public class lesson2 {
    public static void main(String[] args) {
     int[] ints = new int[]{11,12,13,14,15,16,17,18};
        int i=0;

        int[] cifry = new int[]{11,12,13,14,15,16,17,18};

        do {
            i++;
            System.out.println(cifry[i]);
        }
        while (cifry[i]<15);

        polymorphism (2,3);
        polymorphism(8);
        polymorphism (1,2,3);//проверка приоритета логической операции

    }
    static void polymorphism (int b, int c){
        int d = b+c;
        System.out.println(d);
    }

    static void polymorphism (int b){
        int d = b*b;
        System.out.println(d);
    }

    static void polymorphism (int b, int c, int e){
        int d = b+c*e;
        System.out.println(d);
    }




    }


