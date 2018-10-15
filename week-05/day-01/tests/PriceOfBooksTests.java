import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class PriceOfBooksTests {

    @Test
    public void zeroBooksCostZero(){
        HashMap<String, Integer> map = new HashMap<>();
        Assert.assertEquals(PriceOfBooks.priceOfBooks(map), (Object) 0);
    }


    @Test
    public void oneBookCostsEight(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("first book", 1);
        Assert.assertEquals(PriceOfBooks.priceOfBooks(map), (Object) 8);
    }

}
