package sk.itsovy.projectmath.Main;


import sk.itsovy.projectmath.Dot;

public class Main {

    public static void main(String[] args) {

        Dot dot1 = new Dot(5,-6,'B');

        dot1.print();
        System.out.println(dot1.getDistance());
        dot1.getFlip('x');
        dot1.print();
        System.out.println(dot1.getQuadrant());
        dot1.about();

        Dot dot2 = new Dot(8,-4,'F');
    }

}
