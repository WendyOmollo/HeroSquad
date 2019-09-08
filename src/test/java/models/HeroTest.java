package models;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest  {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void makeFirstHero_confirmIfMade_true() throws Exception{
        Hero hero = setUpNewHero();
        assertEquals(true,hero instanceof Hero);
    }
    @Test
    public void makeFirstHero_confirmIfMade_getAllDetails() throws Exception{

        Hero hero = setUpNewHero();
        assertEquals("Superman",hero.getName());
        assertEquals(34,hero.getAge());
        assertEquals("Flying",hero.getStrength());
        assertEquals("Emotional",hero.getWeakness());
    }
//    @Test
//    public void makeFirstHero_getHero_updateDetails() throws Exception{
//        Hero hero = setUpNewHero();
//
//    }

    public Hero setUpNewHero(){
        return new Hero("Superman",34,"Flying","Emotional");
    }
}