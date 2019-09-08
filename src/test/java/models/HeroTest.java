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
        Hero hero = new Hero("Batman",20,"Flying","Angry");
        assertEquals(true,hero instanceof Hero);
    }
    @Test
    public void makeFirstHero_confirmIfMade_getAllDetails() throws Exception{
        Hero hero = new Hero("Batman",20,"Flying","Angry");
        Assert.assertEquals(true,hero.getName());
        Assert.assertEquals(true,hero.getAge());
        Assert.assertEquals(true,hero.getStrength());
        Assert.assertEquals(true,hero.getWeakness());
    }
}