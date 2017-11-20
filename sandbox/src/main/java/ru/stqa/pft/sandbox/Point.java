package ru.stqa.pft.sandbox;

public class Point {
    double x;
    double y;
    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }
    double distance(){
        double a = this.x - this.x;
        double b = this.y - this.y;
        return Math.sqrt(a*a - b*b);
    }
}
