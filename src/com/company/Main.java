package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10, "grey, burnt maroon, and raspberry pink", false);
        Square square = new Square(8,"green",false);
        Rectangle rectangle = new Rectangle(12, 4, "yellow", true);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
    }
}

