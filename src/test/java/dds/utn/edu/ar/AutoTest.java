package dds.utn.edu.ar;

import org.junit.Assert;
import org.junit.Test;

public class AutoTest {

    @Test
    public void testEncendidoOk() throws SinCombustibleException{

        Auto auto = new Auto();
        auto.setCombustible(14.0);
        auto.encender();
        Assert.assertEquals(70,auto.getTemperatura());
        Assert.assertEquals(13.986,auto.getCombustible(),0.0001);


    }

    @Test (expected = SinCombustibleException.class)
    public void testEncendido() throws SinCombustibleException{
        Auto auto = new Auto();
        auto.setCombustible(9.0);
        auto.encender();
    }

}
