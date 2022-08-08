import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;
    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Jarrod", Rank.CAPTAIN);
    }

    @Test
    public void hasName() {
        assertEquals("Jarrod", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.CAPTAIN, cabinCrewMember.getRank());
    }
}
