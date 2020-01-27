package quantity_measurement;

import org.junit.Assert;
import org.junit.Test;

public class LengthMeasurementTest {

    @Test
    public void whenGivenZeroFeetOrZeroFeet_ShouldReturnEquals() {
        LengthMeasurement first = new LengthMeasurement(0.0);
        LengthMeasurement second = new LengthMeasurement(0.0);
        Assert.assertEquals(first,second);
    }

    @Test
    public void whenGivenNullValue_shouldThrowNullException() throws QuantityMeasurementException {
        try {
            LengthMeasurement first = new LengthMeasurement(null);
            LengthMeasurement second = new LengthMeasurement(null);
            Assert.assertEquals(first,second);
        }catch (NullPointerException e){
            throw new QuantityMeasurementException("Null pointer Exception",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }

    }

    @Test
    public void whenGivenReference_shouldReturnEqual() {
        LengthMeasurement first = new LengthMeasurement(2.0);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void whenGivenTypeCheckForFeet_ShouldReturnEquals() {
        LengthMeasurement first = new LengthMeasurement(0.0);
        LengthMeasurement second = new LengthMeasurement(0.0);
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

    //Inch test case

    @Test
    public void whenGivenZeroInchOrZeroInch_ShouldReturnEquals() {
        LengthMeasurement first = new LengthMeasurement(0.0);
        LengthMeasurement second = new LengthMeasurement(0.0);
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

    @Test
    public void whenGivenNullValueForInch_shouldThrowNullException() throws QuantityMeasurementException {
        try {
            LengthMeasurement first = new LengthMeasurement(null);
            LengthMeasurement second = new LengthMeasurement(null);
            Assert.assertEquals(first,second);
        }catch (NullPointerException e){
            throw new QuantityMeasurementException("Null pointer Exception",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }

    }

    @Test
    public void whenGivenInchReference_shouldReturnEqual() {
        LengthMeasurement first = new LengthMeasurement(2.0);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void whenGivenTypeCheckForInch_ShouldReturnEquals() {
        LengthMeasurement first = new LengthMeasurement(0.0);
        LengthMeasurement second = new LengthMeasurement(0.0);
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

}

