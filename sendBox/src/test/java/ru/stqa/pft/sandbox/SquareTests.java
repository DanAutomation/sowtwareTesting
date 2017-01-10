package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandBox.Square;

/**
 * Created by Work on 10.01.2017.
 */
public class SquareTests {

    @Test
    public void testArea(){
        Square sq = new Square(5);
        Assert.assertEquals(sq.area(), 25.0);
    }
}
