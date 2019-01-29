package sk.itsovy.projectmath.data;

import sk.itsovy.projectmath.Circle;
import sk.itsovy.projectmath.Dot;

public class Stack {

        private int capacity;
        private int size;
        private Dot arr[];
        private Circle arr2[];

        public Stack(int capacity){
            this.capacity = capacity;
            this.size = 0;
            this.arr= new Dot[capacity];
            this.arr2=new Circle[capacity];

        }

        public boolean toFull(){
           return size==capacity;
        }

        public boolean isEmpty(){
            return size==0;
        }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void Empty(){
        size=0;
        arr = new Dot[capacity];
    }

    public void Push(Dot dot){

            if(dot==null){
                return;
            }

            if (toFull()) {

                throw new ArrayIndexOutOfBoundsException("The stack is full");

            }
            else
            {
                arr[size]=dot;
                size++;
            }

    }

    public Dot top(){

            if(isEmpty()){
                return null;
            }
            else{
                return arr[size-1];
            }
    }

    public void enqueue (Circle circle){

            if(toFull()){
                throw new ArrayIndexOutOfBoundsException("Que is full");
            }

            if(circle==null){
                return;
            }

            arr2[size]=circle;
            size++;

    }

    public Circle front (){
        if(isEmpty()){
            return null;
        }
        else
        {
            return arr2[0];
        }

    }

    public void dequeue(){
            if(isEmpty()){
                throw new NoSuchFieldError("Queue is empty");
            }
            else
            {
                for (int i=0;i<size-1;i++){
                    arr2[i]=arr2[i+1];
                }
            }
            size--;
            arr2[size]=null;
    }

    public void pop(){

            if(isEmpty()){
                throw new NoSuchFieldError();
            }
            else{
                size--;
            }
    }

    public Dot topAndPop(){
        Dot temp=top();
        pop();
        return temp;

    }

    public void deleteStack(){
            for(int i=0;i<capacity;i++){
                pop();
            }
    }


}
