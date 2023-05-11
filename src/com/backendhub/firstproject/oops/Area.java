package com.backendhub.firstproject.oops;

public class Area {
      protected int length;
      int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    void getArea(){
        int area = length * breadth;
        System.out.println("Area of rectangle: "+area);
    }
}
