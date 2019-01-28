package sk.itsovy.projectmath;

public class Angle {

    private Dot a;
    private Dot b;
    private Dot c;


public Angle(Dot a,Dot b,Dot c){

this.a=a;
this.b=b;
this.c=c;

}

public Angle(int xa,int ya,int xb,int yb,int xc,int yc){
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

    public float getAlpha() {

        double a = getSegmentA();
        double b = getSegmentB();
        double c = getSegmentC();

        float alpha = (float) Math.acos((Math.pow(a,2) + Math.pow(c,2) - Math.pow(b,2))/(2*a*c));

        alpha = (float) (alpha * 180 / Math.PI);

        return alpha;

    }

}