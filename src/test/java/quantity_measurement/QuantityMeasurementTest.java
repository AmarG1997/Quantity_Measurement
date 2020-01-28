package quantity_measurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void whenGivenZeroFeetOrZeroFeet_ShouldReturnEquals() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.Units.FEET);
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.Units.FEET);
        Assert.assertEquals(first,second);
    }

    @Test
    public void whenGivenNullValue_shouldThrowNullException() throws QuantityMeasurementException {
        try {
            QuantityMeasurement first = new QuantityMeasurement(null, QuantityMeasurement.Units.FEET);
            QuantityMeasurement second = new QuantityMeasurement(null, QuantityMeasurement.Units.FEET);
            Assert.assertEquals(first,second);
        }catch (NullPointerException e){
            throw new QuantityMeasurementException("Null pointer Exception",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }
    }

    @Test
    public void whenGivenReference_shouldReturnEqual() {
        QuantityMeasurement first = new QuantityMeasurement(2.0, QuantityMeasurement.Units.FEET);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void whenGivenTypeCheckForFeet_ShouldReturnEquals() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.Units.FEET);
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.Units.FEET);
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

    //Inch test case

    @Test
    public void whenGivenZeroInchOrZeroInch_ShouldReturnEquals() {
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.Units.INCH);
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.Units.INCH);
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

    @Test
    public void whenGivenNullValueForInch_shouldThrowNullException() throws QuantityMeasurementException {
        try {
            QuantityMeasurement first = new QuantityMeasurement(null, QuantityMeasurement.Units.INCH);
            QuantityMeasurement second = new QuantityMeasurement(null, QuantityMeasurement.Units.INCH);
            Assert.assertEquals(first,second);
        }catch (NullPointerException e){
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
        QuantityMeasurement first = new QuantityMeasurement(0.0, QuantityMeasurement.Units.INCH);
        QuantityMeasurement second = new QuantityMeasurement(0.0, QuantityMeasurement.Units.INCH);
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

//Test case for feet and inch

    @Test
    public void whenGivenOneFeetAndOneInch_shouldReturnEquals() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double first = lengthMeasurement.getConversion(0.0, QuantityMeasurement.Units.INCH);
        double second = lengthMeasurement.getConversion(0.0, QuantityMeasurement.Units.FEET);
        Assert.assertTrue(first==second);
    }

    @Test
    public void whenGivenOneFeetAndOneInch_shouldReturnNotEquals() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double first = lengthMeasurement.getConversion(1.0, QuantityMeasurement.Units.INCH);
        double second = lengthMeasurement.getConversion(1.0, QuantityMeasurement.Units.FEET);
        Assert.assertTrue(first!=second);
    }

    @Test
    public void whenGivenOneInchAndOneFeet_shouldReturnNotEquals() {
        QuantityMeasurement lengthMeasurement=new QuantityMeasurement();
        double first=lengthMeasurement.getConversion(1.0, QuantityMeasurement.Units.INCH);
        double second=lengthMeasurement.getConversion(1.0, QuantityMeasurement.Units.FEET);
        Assert.assertTrue(first!=second);
    }

    @Test
    public void WhenGivenFeetAndInch_shouldReturnEquals() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double second = lengthMeasurement.getConversion(1.0, QuantityMeasurement.Units.FEET);
        Assert.assertEquals(12,second,0);
    }

    @Test
    public void WhenGivenFeetAndInches_shouldReturnEquals() {
        QuantityMeasurement lengthMeasurement=new QuantityMeasurement();
        double first=lengthMeasurement.getConversion(12.0, QuantityMeasurement.Units.INCH);
        Assert.assertEquals(1.0,first,0);
    }

    @Test
    public void whenGivenThreeFeet_shouldReturnOneYard() {
        QuantityMeasurement lengthMeasurement=new QuantityMeasurement();
        double first=lengthMeasurement.getConversion(3.0, QuantityMeasurement.Units.FEET_TO_YARD);
        Assert.assertEquals(1.0,first,0);
    }

    @Test
    public void whenGivenOneFeetAndOneYard_shouldReturnNotequals() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double first = lengthMeasurement.getConversion(1.0, QuantityMeasurement.Units.FEET_TO_YARD);
        double second = lengthMeasurement.getConversion(3.0, QuantityMeasurement.Units.FEET_TO_YARD);
        Assert.assertTrue(first != second);
    }

    @Test
    public void whenGivenOneInchAndOneYard_shouldReturnNotEquals() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double first = lengthMeasurement.getConversion(1.0, QuantityMeasurement.Units.INCH_TO_YARD);
        double second = lengthMeasurement.getConversion(36.0, QuantityMeasurement.Units.INCH_TO_YARD);
        Assert.assertTrue(first != second);
    }

    @Test
    public void whenGivenOneYardAndThirtySixInch_shouldReturnEquals() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double first = lengthMeasurement.getConversion(36.0, QuantityMeasurement.Units.INCH_TO_YARD);
        Assert.assertEquals(1.0,first,0);
    }

    @Test
    public void whenGivenThirtySixInch_shouldReturnOneYard() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double val= lengthMeasurement.getConversion(36.0, QuantityMeasurement.Units.INCH_TO_YARD);
        Assert.assertEquals(1.0,val,0);
    }

    @Test
    public void whenGivenOneYard_shouldReturnThreeFeet() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double val = lengthMeasurement.getConversion(1.0, QuantityMeasurement.Units.YARD_TO_FEET);
        Assert.assertEquals(3,val,0);
    }

}


