package sk.itsovy.projectmath.Main;


import sk.itsovy.projectmath.*;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        /*Dot dot1 = new Dot(5,-6,'B');

        dot1.print();
        System.out.println(dot1.getDistance());
        dot1.getFlip('x');
        dot1.print();
        System.out.println(dot1.getQuadrant());
        dot1.about();

        Dot a = new Dot(-2,-2,'A');
        Dot b = new Dot(6,-2,'B');
        Dot c = new Dot(6,4,'C');

        Triangle triangle1 = new Triangle(a,b,c);
        System.out.println("Perimeter of triangle= "+triangle1.getPerimeter());
        System.out.println("Area of triangle= "+triangle1.getArea());
        System.out.println(triangle1.getSegmentA());
        System.out.println(triangle1.getSegmentB());
        System.out.println(triangle1.getSegmentC());
        System.out.println(triangle1.getAlpha());

        Dot a = new Dot(0,2,'A');
        Dot b = new Dot(0,0,'B');
        Dot c = new Dot(0,0,'C');
        Dot d = new Dot(0,0,'D');

        Square square1 = new Square(a,b,c,d);
        System.out.println(square1.getSegmentA());
        System.out.println(square1.getSegmentB());
        System.out.println(square1.getSegmentC());
        System.out.println(square1.getSegmentD());
        System.out.println(square1.getPerimeter());
        System.out.println(square1.getArea());
        System.out.println(square1.getDiagonal());


        Dot c = new Dot(0,2,'C');
        Dot a = new Dot(0,5,'A');
        Dot b = new Dot(2,4,'B');
        Circle circle1 = new Circle(a,b);
        System.out.println("Segment= "+circle1.getSegmentA());
        System.out.println("Radius= "+circle1.getRadius());
        System.out.println("Area of the circle= "+circle1.getArea());
        System.out.println("Perimeter of the circle= "+circle1.getPerimeter());
        System.out.println(circle1.isDotInsideACircle(a));


        Dot a = new Dot(0,2,'A');
        Dot b = new Dot(0,4,'B');
        Dot c = new Dot(0,0,'C');
        Dot d = new Dot(0,0,'D');

        Rectangle rectangle1 = new Rectangle(a,b,c,d);
        System.out.println(rectangle1.getSegmentA());
        System.out.println(rectangle1.getSegmentB());
        System.out.println("Area of the rectangle = "+rectangle1.getArea());
        System.out.println("Perimeter of the rectangle = "+rectangle1.getPerimeter());
        System.out.println("Diagonal of the rectangle = "+rectangle1.getDiagonal());

        Dot3D dot3D= new Dot3D(2,4,7,'D');
        dot3D.print();
        System.out.println(dot3D.getDistance());
        System.out.println(dot3D.getQuadrant());*/
        Dot[] array;
        array= new Dot[10];
        Random rnd= new Random();
        for(int i=0;i<9;i++){

            array[i]= new Dot(rnd.nextInt(41)-20,rnd.nextInt(41)-20,(char) (rnd.nextInt(26) + 'a'));
            array[i].print();

        }
        //aby vypisalo 2 body ktore su najvzdalenejsie od seba

        double firstNum = 0;
        double secondNum = 0;

        for(int i = 0; i < 9; i++){
            if(firstNum < array[i].getDistance()){

                secondNum = firstNum;
                firstNum = array[i].getDistance();

            }else if(secondNum < array[i].getDistance()){

                secondNum = array[i].getDistance();

            }

        }
        for(int i = 0;i < 9;i++){
            System.out.println(array[i].getDistance());
        }
        System.out.println("Top two numbers : First -  "
                + firstNum + " Second " + secondNum);

    }

}
