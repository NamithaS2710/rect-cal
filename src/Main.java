import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(2,3);
        Rectangle rect2 = new Rectangle(10,5);
        System.out.println(rect1.calarea());
        System.out.println(rect1.calperi());
        System.out.println(rect2.calarea());
        System.out.println(rect2.calperi());

    }
}
class Rectangle{
    int length, breadth;
    public Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    int calarea()
    {
        return length*breadth;
    }
    int calperi()
    {
        return 2*(length+breadth);
    }
}