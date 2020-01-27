package quantity_measurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void whenGivenZeroFeetOrZeroFeet_ShouldReturnEquals() {
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

    @Test
    public void whenGivenReference_shouldReturnEqual() {
        Feet first = new Feet(2.0);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void whenGivenTypeCheck_ShouldReturnEquals() {
        Feet first = new Feet(0.0);
        Feet second = new Feet(0.0);
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

    @Test
    public void whenGivenZeroInchOrZeroInch_ShouldReturnEquals() {
        Inch first = new Inch(0.0);
        Inch second = new Inch(0.0);
        Assert.assertEquals(first,second);
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

    @Test
    public void whenGivenNullValueForInch_shouldThrowNullException() throws QuantityMeasurementException {
        try {
            Inch first = new Inch(null);
            Inch second = new Inch(null);
            Assert.assertEquals(first,second);
        }catch (NullPointerException e){
            throw new QuantityMeasurementException("Null pointer Exception",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }

    }

    @Test
    public void whenGivenInchReference_shouldReturnEqual() {
        Inch first = new Inch(2.0);
        Assert.assertTrue(first.equals(first));
    }


}

