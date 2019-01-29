package sk.itsovy.projectmath.Main;


import sk.itsovy.projectmath.*;
import sk.itsovy.projectmath.data.Front;
import sk.itsovy.projectmath.data.Stack;

import java.util.Random;
import java.util.Scanner;

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
        System.out.println(dot3D.getQuadrant());
        Dot[] array;
        array= new Dot[10];
        Random rnd= new Random();
        for(int i=0;i<9;i++){

            array[i]= new Dot(rnd.nextInt(41)-20,rnd.nextInt(41)-20,(char) (rnd.nextInt(26) + 'a'));
            array[i].print();

        }*/

        /*
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
                + firstNum + " Second - " + secondNum);
        Dot[] array;
        array= new Dot[10];
        Random rnd= new Random();
        for(int i=0;i<9;i++){

            array[i]= new Dot(rnd.nextInt(41)-20,rnd.nextInt(41)-20,(char) (rnd.nextInt(26) + 'a'));
            array[i].print();

        }

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
        System.out.println("Top two biggest numbers : First -  "
                + firstNum + " Second - " + secondNum);

        double first = 0;
        double second = 0;
        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < 9 ; i ++)
        {

            if (array[i].getDistance() < first)
            {
                second = first;
                first = array[i].getDistance();
            }


            else if (array[i].getDistance() < second && array[i].getDistance() != first)
                second = array[i].getDistance();
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second" +
                    "smallest element");
        else
            System.out.println("The smallest element is " +
                    first + " and second Smallest" +
                    " element is " + second);

        Circle[] array2;
        array2= new Circle[10];

        for(int i=0; i<5; i++){

            Dot a= new Dot(rnd.nextInt(10)+1,rnd.nextInt(10)+1,(char) (rnd.nextInt(26) + 'a'));
            array2[i]= new Circle(a,rnd.nextInt(10)+1);
            array2[i].print();

        }

        /*
        for(int i=0;i<array2.length;i++){
            for(int j=i+1;j<array2.length;j++){
                double x =array2[i].getS().getDistance(array2[j].getS());
                if(x<array2[i].getRadius()+array2[j].getRadius()){

                    System.out.println("\nCircles that touch");
                    System.out.println("circle on position"+i);
                    array2[i].print();
                    System.out.println("circle on position");
                    array2[j].print();

                }
            }
        }

        Dot a = new Dot(0,2,'A');
        Dot b = new Dot(2,9,'B');
        Dot c = new Dot(4,2,'C');
        Angle uhol1 = new Angle(a,b,c);
        System.out.println(uhol1.getAlpha());

        //najblizši bod ku nule
        //urobiť triedu angle


        Random rnd= new Random();

        Circle[] array2;
        array2= new Circle[10];

        for(int i=0; i<5; i++){

            Dot a= new Dot(rnd.nextInt(10)+1,rnd.nextInt(10)+1,(char) (rnd.nextInt(26) + 'a'));
            array2[i]= new Circle(a,rnd.nextInt(10)+1);
            array2[i].print();

        }

        Circle.printCount();

        Scanner scanner = new Scanner (System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        char name = scanner.next().charAt(0);


        Dot3D dot1 = new Dot3D(x,y,z,name);
        dot1.print();


        Stack Stack = new Stack(3);
        Dot d1 = new Dot(2,3,'D');
        Dot d2 = new Dot(4,1,'A');
        Dot3D d3 = new Dot3D(1,2,6,'E');

        Stack.Push(d1);
        Stack.Push(d2);
        Stack.Push(d3);

        Stack.top().print();*/

        //Queue FIFO du namiesto push Enqueue

        Dot d1 = new Dot(2,3,'D');
        Dot d2 = new Dot(4,1,'A');
        Dot d3 = new Dot(4,3,'C');

        Circle kruh1 = new Circle(d1,1);
        Circle kruh2 = new Circle(d2,2);
        Circle kruh3 = new Circle(d3,3);

        Stack front1 = new Stack(3);
        front1.enqueue(kruh1);
        front1.enqueue(kruh2);
        front1.enqueue(kruh3);

        front1.front().print();

    }

}
