import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void helloIsHello(){
        Assert.assertEquals(Main.isAnagram("Hello","Hello"), true);
    }
    @Test
    public void helloIsNotGreetings(){
        Assert.assertEquals(Main.isAnagram("Hello", "Greetings"), false);
    }
    @Test
    public void danielIsleinad(){
        Assert.assertEquals(Main.isAnagram("daniel", "leinad"), true);
    }

    @Test
    public void danielIsDaniel(){
        Assert.assertEquals(Main.isAnagram("daniel", "Daniel"), true);
    }

    @Test
    public void impossibleIsImpossible(){
        Assert.assertEquals(Main.isAnagram("impossible", "Im possible"), true);
    }

    @Test
    public void nullIsNotString(){
        Assert.assertEquals(Main.isAnagram(null, "Kolek marry me please"), false);
    }
}
