package test;

import dubluri.StubPersoana;
import dubluri.StubPersoanaMajora;
import model.PachetTuristic;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
class PoateRezervaTest {

    @Test
    void minorNuPoateRezerva() {
        StubPersoana stubPersoana= new StubPersoana();
        PachetTuristic pachetTuristic= new PachetTuristic(stubPersoana,"",100.0);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    void majorPoateRezerva() {
        StubPersoanaMajora stubPersoana= new StubPersoanaMajora();
        PachetTuristic pachetTuristic= new PachetTuristic(stubPersoana,"",100.0);
        assertTrue(pachetTuristic.poateRezerva());
    }


}