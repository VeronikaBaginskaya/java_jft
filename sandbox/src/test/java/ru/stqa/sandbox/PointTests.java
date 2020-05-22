package ru.stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

@Test
public class PointTests {
    public void TestDistance() {
        Point p1 = new Point(10,8);
        Point p2 = new Point(19, 8);
        Assert.assertEquals(p1.distance(p2), 9);
    }
}
