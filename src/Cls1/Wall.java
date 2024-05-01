package Cls1;

public class Wall {
    private double width;
    private double height;

    public Wall(double width, double height){
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    public Wall(){
        this(0, 0);
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double d){
        this.height = d < 0 ? 0 : d;
    }

    public void setWidth(double d){
        this.width = d < 0 ? 0 : d;
    }

    public double getArea(){
        return this.height * this.width;
    }
}

/*
* Wall Area

Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.


The class needs to have two constructors:

    The first constructor does not have any parameters (no-args constructor).

    The second constructor has parameters width and height of type double and it needs to initialize the fields.

In case the width parameter is less than 0 it needs to set the width field value to 0.

In case the height parameter is less than 0 it needs to set the height field value to 0.


Write the following methods (instance methods):

    Method named getWidth without any parameters, it needs to return the value of width field.

    Method named getHeight without any parameters, it needs to return the value of height field.

    Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.

    Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.

    Method named getArea without any parameters, it needs to return the area of the wall.
*
* */