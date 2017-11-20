package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
    hello("world");
    hello ("user");
    hello("Olya");

    Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
    Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь треугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
      /*  Point p1 = new Point(5,2);
        Point p2 = new Point(6,3);
        System.out.println("x = " + p1.x + " у = " + p1.y);
        System.out.println("x = " + p2.x + " y = " + p2.y);
        System.out.println("Расстояние между двумя точками = " + p1, p2.distance());*/
    }

    public static void hello (String somebody){

        System.out.println("Hello, " + somebody + "!");
}

}