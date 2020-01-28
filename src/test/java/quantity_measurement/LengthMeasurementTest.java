package quantity_measurement;

import org.junit.Assert;
import org.junit.Test;

public class LengthMeasurementTest {

    @Test
    public void whenGivenZeroFeetOrZeroFeet_ShouldReturnEquals() {
        LengthMeasurement first = new LengthMeasurement(0.0,LengthMeasurement.Units.FEET);
        LengthMeasurement second = new LengthMeasurement(0.0,LengthMeasurement.Units.FEET);
        Assert.assertEquals(first,second);
    }

    @Test
    public void whenGivenNullValue_shouldThrowNullException() throws QuantityMeasurementException {
        try {
            LengthMeasurement first = new LengthMeasurement(null,LengthMeasurement.Units.FEET);
            LengthMeasurement second = new LengthMeasurement(null,LengthMeasurement.Units.FEET);
            Assert.assertEquals(first,second);
        }catch (NullPointerException e){
            throw new QuantityMeasurementException("Null pointer Exception",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }

    }

    @Test
    public void whenGivenReference_shouldReturnEqual() {
        LengthMeasurement first = new LengthMeasurement(2.0,LengthMeasurement.Units.FEET);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void whenGivenTypeCheckForFeet_ShouldReturnEquals() {
        LengthMeasurement first = new LengthMeasurement(0.0,LengthMeasurement.Units.FEET);
        LengthMeasurement second = new LengthMeasurement(0.0,LengthMeasurement.Units.FEET);
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

    //Inch test case

    @Test
    public void whenGivenZeroInchOrZeroInch_ShouldReturnEquals() {
        LengthMeasurement first = new LengthMeasurement(0.0,LengthMeasurement.Units.INCH);
        LengthMeasurement second = new LengthMeasurement(0.0,LengthMeasurement.Units.INCH);
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

    @Test
    public void whenGivenNullValueForInch_shouldThrowNullException() throws QuantityMeasurementException {
        try {
            LengthMeasurement first = new LengthMeasurement(null,LengthMeasurement.Units.INCH);
            LengthMeasurement second = new LengthMeasurement(null,LengthMeasurement.Units.INCH);
            Assert.assertEquals(first,second);
        }catch (NullPointerException e){
            throw new QuantityMeasurementException("Null pointer Exception",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }

    }

    @Test
    public void whenGivenInchReference_shouldReturnEqual() {
        LengthMeasurement first = new LengthMeasurement(2.0,LengthMeasurement.Units.INCH);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void whenGivenTypeCheckForInch_ShouldReturnEquals() {
        LengthMeasurement first = new LengthMeasurement(0.0, LengthMeasurement.Units.INCH);
        LengthMeasurement second = new LengthMeasurement(0.0,LengthMeasurement.Units.INCH);
        Assert.assertTrue(first.getClass().equals(second.getClass()));
    }

//Test case for feet and inch

    @Test
    public void whenGivenOneFeetAndOneInch_shouldReturnEquals() {
        LengthMeasurement lengthMeasurement = new LengthMeasurement();
        double first = lengthMeasurement.getConversion(0.0, LengthMeasurement.Units.INCH);
        double second = lengthMeasurement.getConversion(0.0, LengthMeasurement.Units.FEET);
        System.out.println(first +"  "+second);
        Assert.assertTrue(first==second);
    }

    @Test
    public void whenGivenOneFeetAndOneInch_shouldReturnNotEquals() {
        LengthMeasurement lengthMeasurement = new LengthMeasurement();
        double first = lengthMeasurement.getConversion(1.0, LengthMeasurement.Units.INCH);
        double second = lengthMeasurement.getConversion(1.0, LengthMeasurement.Units.FEET);
        System.out.println(first +"  "+second);
        Assert.assertTrue(first!=second);
    }

    @Test
    public void whenGivenOneInchAndOneFeet_shouldReturnNotEquals() {
        LengthMeasurement lengthMeasurement=new LengthMeasurement();
        double first=lengthMeasurement.getConversion(1.0, LengthMeasurement.Units.INCH);
        double second=lengthMeasurement.getConversion(1.0, LengthMeasurement.Units.FEET);
        System.out.println(first+"  "+second);
        Assert.assertTrue(first!=second);
    }

    @Test
    public void WhenGivenFeetAndInch_shouldReturnEquals() {
        LengthMeasurement lengthMeasurement = new LengthMeasurement();
        double second = lengthMeasurement.getConversion(1.0, LengthMeasurement.Units.FEET);
        System.out.println(second);
        Assert.assertEquals(12,second,0);
    }

    @Test
    public void WhenGivenFeetAndInches_shouldReturnEquals() {
        LengthMeasurement lengthMeasurement=new LengthMeasurement();
        double first=lengthMeasurement.getConversion(12.0, LengthMeasurement.Units.INCH);
        System.out.println(first);
        Assert.assertEquals(1.0,first,0);
    }

    @Test
    public void whenGivenThreeFeet_shouldReturnOneYard() {
        LengthMeasurement lengthMeasurement=new LengthMeasurement();
        double first=lengthMeasurement.getConversion(3.0, LengthMeasurement.Units.FEET_TO_YARD);
        Assert.assertEquals(1.0,first,0);
    }

    @Test
    public void whenGivenOneFeetAndOneYard_shouldReturnNotequals() {
        LengthMeasurement lengthMeasurement = new LengthMeasurement();
        double first = lengthMeasurement.getConversion(1.0, LengthMeasurement.Units.FEET_TO_YARD);
        double second = lengthMeasurement.getConversion(3.0, LengthMeasurement.Units.FEET_TO_YARD);
        Assert.assertTrue(first != second);
    }
}


