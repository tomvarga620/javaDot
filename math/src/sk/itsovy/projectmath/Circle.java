package sk.itsovy.projectmath;

import sk.itsovy.projectmath.Main.Methods;

public class Circle implements Methods {

    private Dot a;
    private Dot b;


    public Circle(Dot a,Dot b){

    this.a=a;
    this.b=b;

    }

    public Circle(int xa,int xy,int xb,int yb){
        a=new Dot(xa,xy,'A');
        a=new Dot(xb,yb,'B');

    }

    public double getSegmentA(){
        return a.getDistance(b);
    }

    public double getRadius(){

        return a.getDistance(b)/2;

    }


    @Override
    public double getArea() {
        double radius = getRadius();
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        double radius = getRadius();
        return 2*Math.PI*radius;
    }

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
    }
}
