package ru.stqa.pft.sandbox;

public class DistanceCount {
    public static void main(String[] args) {
        Point p = new Point(4,9);
        System.out.println("Расстояние между точками " +p.p1 + " и "+ p.p2 + "=" + distance(p));

    }


    public static double distance(Point p) {
        return Math.sqrt(p.p1+p.p2);
}
}