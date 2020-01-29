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
        try {
            QuantityMeasurement first = new QuantityMeasurement(null, QuantityMeasurement.Units.INCH);
            QuantityMeasurement second = new QuantityMeasurement(null, QuantityMeasurement.Units.INCH);
            Assert.assertEquals(first, second);
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null pointer Exception",
                    QuantityMeasurementException.ExceptionType.NULL_POINTER_EXCEPTION);
        }
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

//Test case for feet and inch

    @Test
    public void whenGivenOneFeetAndOneInch_shouldReturnEquals() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double first = lengthMeasurement.getConversion(0.0, QuantityMeasurement.Units.FEET);
        double second = lengthMeasurement.getConversion(0.0, QuantityMeasurement.Units.INCH);
        Assert.assertTrue(first == second);
    }

    @Test
    public void whenGivenOneFeetAndOneInch_shouldReturnNotEquals() {
        double inchvalue = UnitType.FEET.getInchValue(1.0);
        double inchValue = UnitType.INCH.getInchValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void whenGivenOneInchAndOneFeet_shouldReturnNotEquals() {
        double inchvalue = UnitType.INCH.getInchValue(1.0);
        double inchValue = UnitType.FEET.getInchValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void WhenGivenFeetAndInch_shouldReturnEquals() {
        double inchvalue = UnitType.FEET.getInchValue(1.0);
        double inchValue = UnitType.INCH.getInchValue(12.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void WhenGivenFeetAndInches_shouldReturnEquals() {
        double inchvalue = UnitType.FEET.getInchValue(1.0);
        double inchValue = UnitType.INCH.getInchValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void whenGivenThreeFeet_shouldReturnOneYard() {
        double inchvalue = UnitType.FEET.getInchValue(3.0);
        double inchValue = UnitType.YARD.getInchValue(1.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenOneFeetAndOneYard_shouldReturnNotequals() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchvalue = UnitType.FEET.getInchValue(1.0);
        double inchValue = UnitType.YARD.getInchValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void whenGivenOneInchAndOneYard_shouldReturnNotEquals() {
        double inchvalue = UnitType.INCH.getInchValue(1.0);
        double inchValue = UnitType.YARD.getInchValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void whenGivenOneYardAndThirtySixInch_shouldReturnEquals() {
        double inchvalue = UnitType.YARD.getInchValue(1.0);
        double inchValue = UnitType.INCH.getInchValue(36.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenThirtySixInch_shouldReturnOneYard() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchvalue = UnitType.INCH.getInchValue(36.0);
        double inchValue = UnitType.YARD.getInchValue(1.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenOneYard_shouldReturnThreeFeet() {
        double inchvalue = UnitType.YARD.getInchValue(1.0);
        double inchValue = UnitType.FEET.getInchValue(3.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenOneYard1_shouldReturnThreeFeet() {
        double inchvalue = UnitType.YARD.getInchValue(1.0);
        double inchValue = UnitType.FEET.getInchValue(3.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenOneFeetAndOneYard1_shouldReturnNotequals() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.FEET.getInchValue(1.0);
        double val = lengthMeasurement.getConversion(inchValue, QuantityMeasurement.Units.YARD);
        Assert.assertTrue(inchValue != val);
    }

    @Test
    public void whenGivenThreeFeet1_shouldReturnOneYard() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.FEET.getInchValue(3.0);
        double val = lengthMeasurement.getConversion(inchValue, QuantityMeasurement.Units.YARD);
        Assert.assertEquals(1, val, 0);
    }

    @Test
    public void whenGivenTwoInch_shouldReturnFiveCentimeter() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.INCH.getInchValue(2.0);
        double val = lengthMeasurement.getConversion(inchValue, QuantityMeasurement.Units.CM);
        Assert.assertEquals(5, val, 0);
    }

    @Test
    public void whenGivenTwoInchAndTwoInch_shouldReturnFour() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.INCH.getInchValue(2.0);
        double inchValue1 = UnitType.INCH.getInchValue(2.0);
        double result = lengthMeasurement.getAddition(inchValue, inchValue1);
        Assert.assertEquals(4, result, 0);
    }

    @Test
    public void whenGivenOneFetAndTwoInch_shouldReturnFourteenInches() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.FEET.getInchValue(1.0);
        double inchValue1 = UnitType.INCH.getInchValue(2.0);
        double result = lengthMeasurement.getAddition(inchValue, inchValue1);
        Assert.assertEquals(14, result, 0);
    }

    @Test
    public void whenGivenOneFeetAndOneFeet_shouldReturnTwentyFourInches() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.FEET.getInchValue(1.0);
        double inchValue1 = UnitType.FEET.getInchValue(1.0);
        double result = lengthMeasurement.getAddition(inchValue, inchValue1);
        Assert.assertEquals(24, result, 0);
    }
    @Test
    public void whenGivenTwoInchAndTwoPointFiveCm_shouldReturnThreeInches() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.INCH.getInchValue(2.0);
        double inchValue1 = UnitType.CM.getInchValue(2.54);
        double result = lengthMeasurement.getAddition(inchValue, inchValue1);
        Assert.assertEquals(3.0, result, 0);
    }
}


