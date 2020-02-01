package quantity_measurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void whenGivenZeroFeetOrZeroFeet_ShouldReturnEquals() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.Units.INCH,"LENGTH");
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.Units.INCH,"LENGTH");
        Assert.assertEquals(first, second);
    }

    @Test
    public void whenGivenNullValue_shouldThrowNullException(){
            QuantityMeasurement first = new QuantityMeasurement(null, QuantityMeasurement.Units.INCH,"LENGTH");
            QuantityMeasurement second = new QuantityMeasurement(null, QuantityMeasurement.Units.INCH,"LENGTH");
            Assert.assertEquals(first, second);

    }

    @Test
    public void whenGivenReference_shouldReturnEqual() {
        QuantityMeasurement first = new QuantityMeasurement(2.0, QuantityMeasurement.Units.INCH,"LENGTH");
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void whenGivenTypeCheckForFeet_ShouldReturnEquals() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.Units.INCH,"LENGTH");
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.Units.INCH,"LENGTH");
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

    //Inch test case

    @Test
    public void whenGivenZeroInchOrZeroInch_ShouldReturnEquals() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.Units.FEET,"LENGTH");
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.Units.FEET,"LENGTH");
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

    @Test
    public void whenGivenNullValueForInch_shouldThrowNullException(){
            QuantityMeasurement first = new QuantityMeasurement(null, QuantityMeasurement.Units.FEET,"LENGTH");
            QuantityMeasurement second = new QuantityMeasurement(null, QuantityMeasurement.Units.FEET,"LENGTH");
            Assert.assertEquals(first, second);
    }

    @Test
    public void whenGivenInchReference_shouldReturnEqual() {
        QuantityMeasurement first = new QuantityMeasurement(2.0, QuantityMeasurement.Units.INCH,"LENGTH");
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void whenGivenTypeCheckForInch_ShouldReturnEquals() {
        QuantityMeasurement first = new QuantityMeasurement(1.0, QuantityMeasurement.Units.FEET,"LENGTH");
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.Units.FEET,"LENGTH");
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }
}

