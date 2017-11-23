import org.junit.Test;

import static org.junit.Assert.*;

public class LoenkontoTest {
    @Test
    public void testerSaldo() throws Exception{
        Loenkonto konto = new Loenkonto();
        int saldo = konto.setSaldo(10);
        boolean resultat;
        if (saldo <0) {resultat = false;}
        else { resultat = true;}
        assertTrue("Hov, kontoen må bare overhelehovedet ikke være i minus", resultat);



    }

}
