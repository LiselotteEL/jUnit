import static org.junit.Assert.*;

public class PlusTest {
    @org.junit.Test
    public void plusTal() throws Exception {

        Plus test = new Plus();
        int resultat = test.plusTal();

        assertEquals("hov, det er bare mega forkert", 6, resultat);
    }

}