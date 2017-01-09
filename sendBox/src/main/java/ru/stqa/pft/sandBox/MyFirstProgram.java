package ru.stqa.pft.sandBox;

/**
 * Hello world!
 */
class MyFirstProgram {
    public static void main(String[] args) {

        hello();
        Square s = new Square(12.2);
//        s.sq = 12.2;
        area(s.sq);
        Rectangle r = new Rectangle(7, 8);
//        r.a = 7;
//        r.b = 8;
        System.out.println(r.a + r.b + " another example " + area(r));


    }

    private static void area(double sq) {
        System.out.println(sq);
    }

    public static void hello() {
        String someBody = "World";
        System.out.println("Hello, " + someBody);
    }

    public static double area(Square s){
        return s.sq * s.sq;
    }

    public static double area(Rectangle r){
        return r.a * r.b;
    }
}
