import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CuboidTest {

    @Test
    public void testCuboid(){
        Cuboid cuboid = new Cuboid(10, 12, 24);
        Assert.assertEquals(cuboid.getClass().getSimpleName(), "Cuboid");
    }


    @Test
    public void testCuboidInvalidArgs(){
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            new Cuboid(-1, 12, 24);
        });
    }

    @Test
    public void testIsCubeNotCube(){
        Cuboid cuboid = new Cuboid(2, 4, 6);
        Assert.assertFalse(cuboid.isCube());
    }

    @Test
    public void testIsCube(){
        Cuboid cuboid = new Cuboid(2, 2, 2);
        Assert.assertTrue(cuboid.isCube());
    }

    @Test
    public void testTypeTall(){
        Cuboid cuboid = new Cuboid(2, 2, 10);
        Assert.assertEquals(cuboid.type(), "tall");
    }

    @Test
    public void testTypeCube(){
        Cuboid cuboid = new Cuboid(2, 2, 2);
        Assert.assertEquals(cuboid.type(), "cube");
    }

    @Test
    public void testTypeFlat(){
        Cuboid cuboid = new Cuboid(10, 10, 2);
        Assert.assertEquals(cuboid.type(), "flat");
    }

    @Test
    public void testAreaBack(){
        Cuboid cuboid = new Cuboid(3, 4, 5);
        Assert.assertEquals(cuboid.getArea(Side.BACK), 20, 0.001);
    }

    @Test
    public void testAreaLeft(){
        Cuboid cuboid = new Cuboid(3, 4, 5);
        Assert.assertEquals(cuboid.getArea(Side.LEFT), 15, 0.001);
    }

    @Test
    public void testAreaTop(){
        Cuboid cuboid = new Cuboid(3, 4, 5);
        Assert.assertEquals(cuboid.getArea(Side.TOP), 12, 0.001);
    }

    @Test
    public void testAreaInvalidArg(){
        Cuboid cuboid = new Cuboid(3, 4, 5);
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            cuboid.getArea(Side.OTHER);
        });
    }
}
