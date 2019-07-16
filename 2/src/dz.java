public class dz {
    public static void main (String args[]) {
        int i = 10;
        int a = i+2;
        int b = i-2;
        int c = i/2;
        int d = i%3;
        int e = i++;
        int f = i--;
        int g = ++i;
        int h = --i;
        int j = i += 2;
        int k = i -= 2;

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);
        System.out.println("f="+f);
        System.out.println("g="+g);
        System.out.println("h="+h);
        System.out.println("j="+j);
        System.out.println("k="+k);

        int w = Integer.MAX_VALUE;
        System.out.println(w);
        long x = w;
        System.out.println(++x);

        int y = -5;
        System.out.println("y="+y);
        int z = ++y;
        System.out.println("y="+y);
        System.out.println("z="+z);

    }

}
