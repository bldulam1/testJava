package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.w3c.dom.css.Rect;

// A simple example of inheritance.
// Create a superclass.
class A {
    int i, j;
    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}
// Create a subclass by extending class A.
class B extends A {
    int k;
    void showk() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i+j+k: " + (i+j+k));
    }
}

class Box {
    double width;
    double height;
    double depth;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box(){
        width = -1;
        height = -1;
    depth = -1;
}

    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return  height * width * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight (double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}


class Rectangle {
    double length;
    double width;

    Rectangle(){
        length = 0;
        width = 0;
    }

    Rectangle(double l){
        length = width = l;
    }

    Rectangle(double l, double w){
        length = l;
        width = w;
    }

    double area(){
        return length * width;
    }

    double perimeter(){
        return 2 * (length + width);
    }
}


class Main {
    public static void main(String args[]) {
//        A superOb = new A();
//        B subOb = new B();
//// The superclass may be used by itself.
//        superOb.i = 10;
//        superOb.j = 20;
//        System.out.println("Contents of superOb: ");
//        superOb.showij();
//        System.out.println();
///* The subclass has access to all public members of
//its superclass. */
//        subOb.i = 7;
//        subOb.j = 8;
//        subOb.k = 9;
//        System.out.println("Contents of subOb: ");
//        subOb.showij();
//        subOb.showk();
//        System.out.println();
//        System.out.println("Sum of i, j and k in subOb:");
//        subOb.sum();

//        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
//        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
//        double vol;
//
//        vol = mybox1.volume();
//        System.out.println("Volume of mybox1 is " + vol);
//        System.out.println("Weight of mybox1 is " + mybox1.weight);
//
//        vol = mybox2.volume();
//        System.out.println("Volume of mybox2 is " + vol);
//        System.out.println("Weight of mybox2 is "+ mybox2.weight);

//        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
//        Box plainbox = new Box();
//        double vol;
//
//        vol = weightbox.volume();
//        System.out.println("Volume of weightbox is " + vol);
//        System.out.println("Weight of weightbox is " + weightbox.weight);
//        System.out.println();
//
//        plainbox = weightbox;
//        vol = plainbox.volume();
//        System.out.println("Volume of plainbox is " + vol);

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(1);
        Rectangle rect3 = new Rectangle(5,2);

        System.out.println("Area and Perimeter of rect1:" + rect1.area() + " " + rect1.perimeter() );
        System.out.println("Area and Perimeter of rect2:" + rect2.area() + " " + rect2.perimeter() );
        System.out.println("Area and Perimeter of rect3:" + rect3.area() + " " + rect3.perimeter() );

    }
}