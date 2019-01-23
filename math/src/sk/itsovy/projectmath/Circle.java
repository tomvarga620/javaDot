package sk.itsovy.projectmath;

import sk.itsovy.projectmath.Main.Methods;

public class Circle implements Methods {

    private Dot a;
    private double radius;


    public Circle(Dot a,double b){

    this.a=a;
    this.radius=b;

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

}
