package ru.stqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

@Test
public class PointTests {
    public void TestDistance() {
        Point p = new Point(9,8);
        Assert.assertEquals(p.distance(), 4.123105625617661);
    }
}
