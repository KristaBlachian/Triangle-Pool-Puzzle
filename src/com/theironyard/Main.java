package com.theironyard;

public class Main {
    double area;
    int height;
    int length;
    public static void main(String[] args) {
    int x = 0;
    Main[] ta = new Main[4];
    while (x < 4) {
        ta[x] = new Main();
        ta[x].height = (x + 1) * 2;
        ta[x].length = x + 4;
        ta[x].setArea();
        System.out.println("triangle "+ x +", area");
        System.out.println(" = " + ta[x].area);
        x = x + 1;
    }
    int y = x;
    x = 27;
    Main t5 = ta[2];
    ta[2].area = 343;
    System.out.print("y = " + y);
    System.out.println(", t5 area ="+ t5.area);
    }
    void setArea() {
        area = (height * length) / 2;
    }
}

//main = triangle. Intellij did not like me trying to change it.