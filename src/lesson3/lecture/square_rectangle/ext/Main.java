package lesson3.lecture.square_rectangle.ext;

import lesson3.lecture.square_rectangle.Rectangle;
import lesson3.lecture.square_rectangle.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        System.out.println(rectangle.getArea());
        Rectangle sqaure = new Square(5);
        System.out.println(sqaure.getArea());
        sqaure.setWidth(6); //this will still make length 5
        System.out.println(sqaure.getArea()); //square becomes 30 instead of 66
        //this defeats the purpose of inheritance as we have to then override setWidth and setLength
        //for this to work

    }
}
