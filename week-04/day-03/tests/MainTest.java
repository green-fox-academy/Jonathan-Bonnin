import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTest {

    ArrayList<Integer> list = new ArrayList<>();

    //clears list before every test
    @Before
    public void before(){
        list.clear();
    }

    @Test
    public void sumEmptyListTest(){
        assertEquals(0, Main.sum(list));
    }

    @Test
    public void sumOneElemInListTest(){
        list.add(10);
        assertEquals(10, Main.sum(list));
    }

    @Test
    public void sumManyElemInListTest(){
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        assertEquals(15, Main.sum(list));
    }

    @Test(expected=NullPointerException.class)
    public void sumNullListTest(){
        list = null;
        assertEquals(999, Main.sum(list));
    }

}