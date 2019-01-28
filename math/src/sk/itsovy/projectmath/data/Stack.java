package sk.itsovy.projectmath.data;

import sk.itsovy.projectmath.Dot;

public class Stack {

        private int capacity;
        private int size;
        private Dot arr[];

        public Stack(int capacity){
            this.capacity = capacity;
            this.size = 0;
            this.arr= new Dot[capacity];

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
