package ru.stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Square;

public class SquareTests {

@Test
    public void testArea() {
        Square s = new Square(9);
        Assert.assertEquals(s.area(),81);
    }
}
