package quantity_measurement;

import org.junit.Assert;
import org.junit.Test;

public class ValueConversionTest {

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
    public void whenGivenOneGallon_shouldReturnInLitres() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.GALLON.getInchValue(1.0);
        double val = lengthMeasurement.getConversion(inchValue, QuantityMeasurement.Units.LITRE);
        Assert.assertEquals(3.785, val, 0);
    }
}
