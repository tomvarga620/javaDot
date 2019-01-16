package sk.itsovy.projectmath;

import sk.itsovy.projectmath.Main.Methods;

public class Triangle  implements Methods {
    private Dot a;
    private Dot b;
    private Dot c;

    public Triangle(Dot a,Dot b,Dot c){
        this.a=a;
        this.b=b;
        this.c=c;

    }

    public Triangle(int xa,int ya,int xb,int yb,int xc,int yc){
        a = new Dot(xa,ya,'A');
        b = new Dot(xb,yb,'B');
        c = new Dot(xc,yc,'C');
    }

    public double getSegmentA(){
        return a.getDistance(b);
    }

    public double getSegmentB(){
        return b.getDistance(c);
    }

    public double getSegmentC(){
        return c.getDistance(a);
    }

    @Override
    public double getArea() {

        double a = getSegmentA();
        double b = getSegmentB();
        double c = getSegmentC();

        double s = (a + b + c)/2;
        double x = (s * (s-a) * (s-b) * (s-c));
        double Area= Math.sqrt(x);
        return Area;
    }

    @Override
    public double getPerimeter() {
        return getSegmentA()+getSegmentB()+getSegmentC();
    }

}
