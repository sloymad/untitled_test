package ru.stqa.pft.sandbox;

class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Alexei");

        Square s = new Square(5);
        System.out.println("Площадь кв со сторной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        r.a = 4;
        r.b = 6;
        System.out.println("Gkjoflm ghzvjeu"+ r.a + "и" +r.b + " = " + r.area());
    }

    public static void hello (String somebody) {

        System.out.println( "Hello, " + somebody + "!");
    }


}

