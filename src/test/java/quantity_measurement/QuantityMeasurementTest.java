package quantity_measurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void whenGivenZeroFeetOrZeroFeet1_ShouldReturnEquals() {
        Feet first = new Feet(0.0);
        Feet second = new Feet(0.0);
        Assert.assertEquals(first,second);
    }

}

