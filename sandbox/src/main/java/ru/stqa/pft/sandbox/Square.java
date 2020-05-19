package ru.stqa.pft.sandbox;

import javafx.scene.effect.Blend;

public class Square {
    public double l;
    public Square(double l) {
        this.l=l;
    }

    public double area() {
        return this.l*this.l;

    }
}
