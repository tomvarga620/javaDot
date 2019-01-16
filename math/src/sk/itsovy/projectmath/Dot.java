package sk.itsovy.projectmath;

public class Dot {

private int x;
private int y;
private char name;
private Quarter quarter;

/*getters setters*/
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

/*constructor*/
    public Dot(){
        x=y=0;
    }

    public Dot(int x, int y, char name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Dot(int x){
        x=y=x;
    }

    public Quarter getQuarter() {
        return quarter;
    }

    public void setQuarter(Quarter quarter) {
        this.quarter = quarter;
    }

    public double getDistance(){
        return Math.sqrt(x*x+y*y);
    }

    public double getDistance(Dot bod){
        return Math.sqrt(Math.pow((y-x),2) + Math.pow((bod.getY()-bod.getX()),2));
    }

    public Quarter getQuadrant(){

        if(x>0 && y>0){
            return Quarter.I;
        }
        else if(x<0 && y>0){
            return Quarter.II;
        }
        else if(x<0 && y<0){
            return Quarter.III;
        }
        else if(x>0 && y<0){
            return Quarter.IV;
        }
        else
        {
            return Quarter.NO;
        }

    }

    public void getFlip(char z){
        if(z == 'x' || z == 'X')
            this.y=-y;
        else
            if(z == 'y' || z == 'Y'){
                this.x=-x;
        }
    }

    public void print(){

        System.out.println("Dot Name= "+name+"  X distance= "+x+"  Y distance= "+y);
    }

    public static void about(){

        System.out.println("Author= Tomáš Varga"+"  Date= 2019");

    }


}

