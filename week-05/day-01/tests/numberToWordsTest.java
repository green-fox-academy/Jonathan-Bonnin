import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class numberToWordsTest {

    @Test
    public void numberIsWord(){
        Assert.assertEquals(numberToWords.convertToWord(1),"one");
    }

    @Test
    public void largerNumberIsBiggerWord(){
        Assert.assertEquals(numberToWords.convertToWord(45), "forty five");
    }

    @Test
    public void inputIsNumber(){
        Assert.assertNotEquals(numberToWords.convertToWord(null), "one");
    }
}