package Day9;

public class _01_Increment {

    public static void main(String[] args) {

        int x = 1;
//        x = x + 1; // incrementing x value by 1
        x++; // same as line 8
        System.out.println(x);


//        System.out.println(y++);
        int y = 1;
        System.out.println(y); // 1
        y = y + 1;
        System.out.println(y); // 2

//        System.out.println(++m);
        int m = 1;
        m = m + 1;
        System.out.println(m); //


        int v = 1;
        int z = v++;

        System.out.println(z); // z = 1
        System.out.println(v); // v = 2

        int a = 1;
        int b = ++a;

        System.out.println(b); // a = 2
        System.out.println(a); // b = 2


        int f = 1;
        System.out.println(f); // the result will be 1
        System.out.println(f++); // will print 1, then increase value of f by 1
        System.out.println(f); // the result will b 2


        int p = 5;
        System.out.println(++p); // p = 6;
        System.out.println(p++); // output = 6, then increment p by 1 | p = 7
        System.out.println(p); // 7

    }

}
