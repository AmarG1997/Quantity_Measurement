package quantity_measurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void whenGivenZeroFeetOrZeroFeet_ShouldReturnEquals() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.Units.INCH);
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.Units.INCH);
        Assert.assertEquals(first, second);
    }

    @Test
    public void whenGivenNullValue_shouldThrowNullException() throws QuantityMeasurementException {
            QuantityMeasurement first = new QuantityMeasurement(null, QuantityMeasurement.Units.INCH);
            QuantityMeasurement second = new QuantityMeasurement(null, QuantityMeasurement.Units.INCH);
            Assert.assertEquals(first, second);

    }

    @Test
    public void whenGivenReference_shouldReturnEqual() {
        QuantityMeasurement first = new QuantityMeasurement(2.0, QuantityMeasurement.Units.INCH);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void whenGivenTypeCheckForFeet_ShouldReturnEquals() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.Units.INCH);
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.Units.INCH);
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

    //Inch test case

    @Test
    public void whenGivenZeroInchOrZeroInch_ShouldReturnEquals() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.Units.FEET);
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.Units.FEET);
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

    @Test
    public void whenGivenNullValueForInch_shouldThrowNullException() throws QuantityMeasurementException {
        try {
            QuantityMeasurement first = new QuantityMeasurement(null, QuantityMeasurement.Units.FEET);
            QuantityMeasurement second = new QuantityMeasurement(null, QuantityMeasurement.Units.FEET);
            Assert.assertEquals(first, second);
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null pointer Exception",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }
    }

    @Test
    public void whenGivenInchReference_shouldReturnEqual() {
        QuantityMeasurement first = new QuantityMeasurement(2.0, QuantityMeasurement.Units.INCH);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void whenGivenTypeCheckForInch_ShouldReturnEquals() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.Units.FEET);
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.Units.FEET);
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }
}

