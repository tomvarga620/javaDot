package sk.itsovy.projectmath;

import sk.itsovy.projectmath.Main.Methods;

public class Square implements Methods {

    private Dot a;
    private Dot b;
    private Dot c;
    private Dot d;

    public Square(){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }

    public Square(int xa,int ya,int xb,int yb,int xc,int yc,int xd,int yd){
        a = new Dot(xa,ya,'A');
        b = new Dot(xb,yb,'B');
        c = new Dot(xc,yc,'C');
        d = new Dot(xd,yd,'D');

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

    public double getSegmentD(){
        return d.getDistance(d);
    }


    @Override
    public double getArea() {

        double a = getSegmentA();
        double b = getSegmentB();
        double c = getSegmentC();
        double d = getSegmentD();
        double result;

        if(a==b && a==c && a==d)
            result = Math.pow(a,2);
        return result;




    }

    @Override
    public double getPerimeter() {
        return getSegmentA()+getSegmentB()+getSegmentC()+getSegmentD();
    }
}
