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
        Hero.clearAllHeroes();
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
    @Test
    public void makeFirstHero_getHero_updateDetails() throws Exception{
        Hero hero = setUpNewHero();
        int formerId = hero.getId();
        String formerName = hero.getName();
        int formerAge = hero.getAge();
        String formerStrength = hero.getStrength();
        String formerWeakness = hero.getWeakness();
        hero.updateHero("Batman",21,"Swimming","Angry");
        assertEquals(formerId,hero.getId());
        assertNotEquals(formerAge,hero.getAge());
        assertNotEquals(formerName,hero.getName());
        assertNotEquals(formerStrength,hero.getStrength());
        assertNotEquals(formerWeakness,hero.getWeakness());
        }
        @Test
        public void makeFirstHero_getHero_deleteTheHero() throws Exception{
        Hero hero = setUpNewHero();
        hero.deleteHero(1,"Batman",21,"Flying","Angry");
        assertEquals(1,hero.getId());
        }
        @Test
        public void makeFirstHero_deleteAllHeroes() throws Exception{
        Hero hero = setUpNewHero();
        Hero otherHero = setUpNewHero();
        hero.clearAllHeroes();
        assertEquals(0,Hero.getAll().size());
        }

    public Hero setUpNewHero(){
        return new Hero("Superman",34,"Flying","Emotional");
    }
}