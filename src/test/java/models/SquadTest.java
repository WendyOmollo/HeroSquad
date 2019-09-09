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
        Squad.clearAllSquads();
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
    @Test
    public void makeNewSquad_updateSquadDetails() throws Exception{
        Squad squad = setUpNewSquad();
        String formerName = squad.getName();
        int formerMaxSize = squad.getMaxSize();
        String formerMission = squad.getMission();
        squad.updateSquad("PowerPuff Girls",3,"Taking kids to school");
        assertNotEquals(formerName,squad.getName());
        assertNotEquals(formerMaxSize,squad.getMaxSize());
        assertNotEquals(formerMission,squad.getMission());
    }
    @Test
    public void makeASquad_deleteASquad() throws Exception{
        Squad squad = setUpNewSquad();
        squad.deleteSquad("Titans",4,"Beating thieves",1);
        assertEquals(1,squad.getIdentifier());
    }
    @Test
    public void makeSquads_deleteAllSquads() throws Exception{
        Squad squad = setUpNewSquad();
        Squad otherSquad = setUpNewSquad();
        squad.clearAllSquads();
        assertEquals(0,Squad.getAll().size());
    }@Test

    public Squad setUpNewSquad(){
        return new Squad("Titans",4,"Beating thieves");
    }
}