package sk.itsovy.projectmath.data;

import sk.itsovy.projectmath.Circle;

public class Front {


    private int capacity;
    private int size;
    private Circle array[];

    public Front(int cap){
        this.capacity=cap;
        this.size=0;
        this.array=new Circle[capacity];
    }

    public boolean isFull(){
        return size==capacity;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void queue(Circle circle){
        if (circle==null){
            return;
        }
        if (isFull()){
            throw new ArrayIndexOutOfBoundsException("Stack is full");
        }
        else {
            array[size]=circle;
            size++;
        }
    }

    public void front(Circle circle){
        if (isEmpty()) {
            throw new NoSuchFieldError();
        }else{
            for (int i=0;i<size-1;i++){
                array[i]=array[i+1];
            }
            size--;
            array[size]=null;
        }
    }

    public Circle circle(){
        if (isEmpty()){
            return null;
        }else{
            return array[0];
        }
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return capacity;
    }

    public void empty(){
        size=0;
        array = new Circle [capacity];
    }


}
