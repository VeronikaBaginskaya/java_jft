package ru.stqa.pft.sandbox;

public class DistanceCount {
    public static void main(String[] args) {
        Point p1 = new Point(1,4);
        Point p2 = new Point(11,4);
        System.out.println("Расстояние между точками " +p1.x + ";"  + p1.y + " и "+ p2.x + ";"  + p2.y +"=" + distance(p1,p2));
        System.out.println("Расстояние между точками " +p1.x + ";"  + p1.y + " и "+ p2.x + ";"  + p2.y +"=" + p1.distance(p2));


    }

    public static double distance(Point p1, Point p2) {
        double x = p2.x-p1.x;
        double y = p2.y - p1.y;
        return Math.sqrt((x*x) + (y*y));
    }

}