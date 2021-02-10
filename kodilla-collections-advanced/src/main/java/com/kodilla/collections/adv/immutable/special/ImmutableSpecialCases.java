package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static Integer c = 100;                      // [1]
    private static final Integer d = 100;
    // [2]
    public static void main(String[] args) {

        int ai = 1280;
        int bi = 1280;
        System.out.println(ai == bi);

        System.out.println("-----");
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println("-----");
        String x = new String("This is string");
        String y = new String("This is string");
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(x == y);
        System.out.println(x.equals(y));

        System.out.println("-----");
        String xPr = "This is string";
        String yPr = "This is string";
        System.out.println(xPr.hashCode());
        System.out.println(yPr.hashCode());
        System.out.println(xPr == yPr);
        System.out.println(xPr.equals(yPr));

        System.out.println("-----");
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        System.out.println(c.equals(d));

        System.out.println("-----");
        c = c + 10;                           // [3]
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c == d);
        System.out.println(c.equals(d));

        System.out.println("-----");
        a = 10567;                            // [4]
        b = 10567;                            // [5]
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
