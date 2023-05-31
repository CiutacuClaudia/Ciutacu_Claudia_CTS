package test;

import dubluri.FakePersoana;
import model.PachetTuristic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AplicaDiscountTest {

    @Test
    void nuSeAplicaDiscountTest() {
        FakePersoana fakePersoana= new FakePersoana();
        fakePersoana.setGetVarstaValue(6);
        PachetTuristic pachetTuristic= new PachetTuristic(fakePersoana,"",100.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(100, pachetTuristic.getPret());
    }

    @Test
    void seAplicaDiscountTest() {
        FakePersoana fakePersoana= new FakePersoana();
        fakePersoana.setGetVarstaValue(89);
        PachetTuristic pachetTuristic= new PachetTuristic(fakePersoana,"",1000.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(900,pachetTuristic.getPret());
    }
}