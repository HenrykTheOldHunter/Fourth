package com.company;

public class Square extends Rectangle{
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public Square(double side){
        super(side, side);
    }

    public Square(){}

    @Override
    public double getWidth() {return super.getWidth();}
    @Override
    public void setWidth(double width) {super.setWidth(width);}

    @Override
    public double getLength() {return super.getLength();}
    @Override
    public void setLength(double length) {super.setLength(length);}

    @Override
    public double getArea() {return super.getArea();}
    @Override
    public double getPerimeter() {return super.getPerimeter();}

    @Override
    public String toString() {return super.toString();}
}

