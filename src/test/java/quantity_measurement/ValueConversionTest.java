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
        double inchvalue = UnitType.FEET.getTypeValue(1.0);
        double inchValue = UnitType.INCH.getTypeValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void whenGivenOneInchAndOneFeet_shouldReturnNotEquals() {
        double inchvalue = UnitType.INCH.getTypeValue(1.0);
        double inchValue = UnitType.FEET.getTypeValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void WhenGivenFeetAndInch_shouldReturnEquals() {
        double inchvalue = UnitType.FEET.getTypeValue(1.0);
        double inchValue = UnitType.INCH.getTypeValue(12.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void WhenGivenFeetAndInches_shouldReturnEquals() {
        double inchvalue = UnitType.FEET.getTypeValue(1.0);
        double inchValue = UnitType.INCH.getTypeValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void whenGivenThreeFeet_shouldReturnOneYard() {
        double inchvalue = UnitType.FEET.getTypeValue(3.0);
        double inchValue = UnitType.YARD.getTypeValue(1.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenOneFeetAndOneYard_shouldReturnNotequals() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchvalue = UnitType.FEET.getTypeValue(1.0);
        double inchValue = UnitType.YARD.getTypeValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void whenGivenOneInchAndOneYard_shouldReturnNotEquals() {
        double inchvalue = UnitType.INCH.getTypeValue(1.0);
        double inchValue = UnitType.YARD.getTypeValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void whenGivenOneYardAndThirtySixInch_shouldReturnEquals() {
        double inchvalue = UnitType.YARD.getTypeValue(1.0);
        double inchValue = UnitType.INCH.getTypeValue(36.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenThirtySixInch_shouldReturnOneYard() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchvalue = UnitType.INCH.getTypeValue(36.0);
        double inchValue = UnitType.YARD.getTypeValue(1.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenOneYard_shouldReturnThreeFeet() {
        double inchvalue = UnitType.YARD.getTypeValue(1.0);
        double inchValue = UnitType.FEET.getTypeValue(3.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenOneYard1_shouldReturnThreeFeet() {
        double inchvalue = UnitType.YARD.getTypeValue(1.0);
        double inchValue = UnitType.FEET.getTypeValue(3.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenOneFeetAndOneYard1_shouldReturnNotequals() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.FEET.getTypeValue(1.0);
        double val = lengthMeasurement.getConversion(inchValue, QuantityMeasurement.Units.YARD);
        Assert.assertTrue(inchValue != val);
    }

    @Test
    public void whenGivenThreeFeet1_shouldReturnOneYard() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.FEET.getTypeValue(3.0);
        double val = lengthMeasurement.getConversion(inchValue, QuantityMeasurement.Units.YARD);
        Assert.assertEquals(1, val, 0);
    }

    @Test
    public void whenGivenOneGallon_shouldReturnInLitres() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.GALLON.getTypeValue(1.0);
        double val = lengthMeasurement.getConversion(inchValue, QuantityMeasurement.Units.LITRE);
        Assert.assertEquals(3.785, val, 0);
    }

    @Test
    public void whenGivenOneLitre_shouldReturnInMililitres() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double value1 = UnitType.LITRES.getTypeValue(1.0);
        double value2 = lengthMeasurement.getConversion(value1, QuantityMeasurement.Units.ML);
        Assert.assertEquals(1000.0, value2, 0);
    }

    @Test
    public void whenGivenOneKg_shouldReturnThousandGrams() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double value1 = UnitType.KILOGRAM.getTypeValue(1.0);
        double value2 = lengthMeasurement.getConversion(value1, QuantityMeasurement.Units.GRAM);
        Assert.assertEquals(1000.0, value2, 0);
    }

    @Test
    public void whenGivenOneTonee_shouldReturnThousandKgs() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double value1 = UnitType.TONNE.getTypeValue(1.0);
        double value2 = lengthMeasurement.getConversion(value1, QuantityMeasurement.Units.KILOGRAM);
        Assert.assertEquals(1000.0, value2, 0);
    }

    @Test
    public void whenGivenFahrenheit_shouldReturnCelcius() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double value2 = lengthMeasurement.getConversion(212, QuantityMeasurement.Units.CELCIUS);
        Assert.assertEquals(100, value2, 0);
    }
}
