package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void makeNewSquad_true() throws Exception{
        Squad squad = setUpNewSquad();
        assertEquals(true ,squad instanceof Squad);
    }
    @Test
    public void makeNewSquad_confirmIfMade_getDetails() throws Exception{
        Squad squad = setUpNewSquad();
        assertEquals("Titans",squad.getName());
        assertEquals(4,squad.getMaxSize());
        assertEquals("Beating thieves",squad.getMission());
    }

    public Squad setUpNewSquad(){
        return new Squad("Titans",4,"Beating thieves");
    }
}