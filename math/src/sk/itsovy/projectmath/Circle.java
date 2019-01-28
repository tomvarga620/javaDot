package sk.itsovy.projectmath;

import sk.itsovy.projectmath.Main.Methods;

public class Circle implements Methods {

    private Dot a;
    private double radius;
    private static int count=0;


    public Circle(Dot a,double b){

    this.a=a;
    this.radius=b;
    count++;

    }

    public Circle(int xa,int xy,int xb,int yb){
        a=new Dot(xa,xy,'A');
        a=new Dot(xb,yb,'B');

    }

    public double getB() {
        return radius;
    }

    public double getDiameter(){

        return radius*2;

    }

    public Dot getS(){
        return a;

    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    /*
    public boolean isDotInsideACricle(Dot bod){
        double radius = getRadius();
        double a = getSegmentA();
        if(radius<=a){
            return false;
        }
        else
        {
            return true;
        }
    }*/

    public void print(){
        System.out.println("x= "+a.getX()+" y= "+a.getY()+" Radius= "+getB());
    }

    public static void printCount(){

        System.out.println("Number of circles= "+count);

    }//statická metoda vie pracovat len so static premennami

}
