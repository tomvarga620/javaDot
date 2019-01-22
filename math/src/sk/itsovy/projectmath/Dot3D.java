package sk.itsovy.projectmath;

public class Dot3D extends Dot {

    private int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Dot3D(int x, int y,int z,char name ){
        super(x, y, name);//posiela x y name constructoru ktory je v rodičovi(class Dot)
        this.z = z;
    }

    public void print(){

        System.out.println("Dot Name= "+getName()+"  X distance= "+getX()+"  Y distance= "+getY()+"  Z distance= "+z);
    }


    public double getDistance() {
        int x = getX();
        int y = getX();
        int z = getX();

        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
    }

    public Quarter getQuadrant(){

        return Quarter.NO;

    }

}
