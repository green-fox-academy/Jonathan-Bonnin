import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

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

    @Test
    public void isAnagramDifferentLengthTest(){
        assertEquals(false, Main.isAnagram("aa", "aaa"));
    }

    @Test
    public void isAnagramDiffentLetterCountTest(){
        assertEquals(false, Main.isAnagram("oop", "opp"));
    }

    @Test
    public void isAnagramTest(){
        assertEquals(true, Main.isAnagram("Michel", "EL Mich"));
    }

    @Test
    public void countLettersEmptyStringTest(){
        assertEquals(true, Main.countLetters("").isEmpty());
    }

    @Test
    public void countLettersTest(){
        HashMap<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('m', 1);
        dictionary.put('i', 1);
        dictionary.put('c', 1);
        dictionary.put('h', 1);
        dictionary.put('e', 2);
        dictionary.put('l', 2);
        assertEquals(dictionary, Main.countLetters("michelle"));
    }





}