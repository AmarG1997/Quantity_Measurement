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

    @Test
    public void whenGivenNullValue_shouldThrowNullException() throws QuantityMeasurementException {
        try {
            Feet first = new Feet(null);
            Feet second = new Feet(null);
            Assert.assertEquals(first,second);
        }catch (NullPointerException e){
            throw new QuantityMeasurementException("Null pointer Exception",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }

    }
}
