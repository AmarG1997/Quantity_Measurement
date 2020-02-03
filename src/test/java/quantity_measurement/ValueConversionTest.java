package quantity_measurement;

import org.junit.Assert;
import org.junit.Test;

public class ValueConversionTest {

    @Test
    public void whenGivenOneFeetAndOneInch_shouldReturnEquals() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double first = quantityMeasurement.getLengthConversion(0.0, UnitType.FEET);
        double second = quantityMeasurement.getLengthConversion(0.0, UnitType.INCH);
        Assert.assertTrue(first == second);
    }

    @Test
    public void whenGivenOneFeetAndOneInch_shouldReturnNotEquals() {
        double inchvalue = UnitType.FEET.getLowestUnitValue(1.0);
        double inchValue = UnitType.INCH.getLowestUnitValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void whenGivenOneInchAndOneFeet_shouldReturnNotEquals() {
        double inchvalue = UnitType.INCH.getLowestUnitValue(1.0);
        double inchValue = UnitType.FEET.getLowestUnitValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void WhenGivenFeetAndInch_shouldReturnEquals() {
        double inchvalue = UnitType.FEET.getLowestUnitValue(1.0);
        double inchValue = UnitType.INCH.getLowestUnitValue(12.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void WhenGivenFeetAndInches_shouldReturnEquals() {
        double inchvalue = UnitType.FEET.getLowestUnitValue(1.0);
        double inchValue = UnitType.INCH.getLowestUnitValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void whenGivenThreeFeet_shouldReturnOneYard() {
        double inchvalue = UnitType.FEET.getLowestUnitValue(3.0);
        double inchValue = UnitType.YARD.getLowestUnitValue(1.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenOneFeetAndOneYard_shouldReturnNotequals() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchvalue = UnitType.FEET.getLowestUnitValue(1.0);
        double inchValue = UnitType.YARD.getLowestUnitValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void whenGivenOneInchAndOneYard_shouldReturnNotEquals() {
        double inchvalue = UnitType.INCH.getLowestUnitValue(1.0);
        double inchValue = UnitType.YARD.getLowestUnitValue(1.0);
        Assert.assertTrue(inchValue != inchvalue);
    }

    @Test
    public void whenGivenOneYardAndThirtySixInch_shouldReturnEquals() {
        double inchvalue = UnitType.YARD.getLowestUnitValue(1.0);
        double inchValue = UnitType.INCH.getLowestUnitValue(36.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenThirtySixInch_shouldReturnOneYard() {
        double inchvalue = UnitType.INCH.getLowestUnitValue(36.0);
        double inchValue = UnitType.YARD.getLowestUnitValue(1.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenOneYard_shouldReturnThreeFeet() {
        double inchvalue = UnitType.YARD.getLowestUnitValue(1.0);
        double inchValue = UnitType.FEET.getLowestUnitValue(3.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenOneYard1_shouldReturnThreeFeet() {
        double inchvalue = UnitType.YARD.getLowestUnitValue(1.0);
        double inchValue = UnitType.FEET.getLowestUnitValue(3.0);
        Assert.assertTrue(inchValue == inchvalue);
    }

    @Test
    public void whenGivenOneFeetAndOneYard1_shouldReturnNotequals() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.FEET.getLowestUnitValue(1.0);
        double val = quantityMeasurement.getLengthConversion(inchValue, UnitType.YARD);
        Assert.assertTrue(inchValue != val);
    }

    @Test
    public void whenGivenThreeFeet1_shouldReturnOneYard() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.FEET.getLowestUnitValue(3.0);
        double val = quantityMeasurement.getLengthConversion(inchValue,UnitType.YARD);
        Assert.assertEquals(1, val, 0);
    }

    @Test
    public void whenGivenOneGallon_shouldReturnInLitres() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.GALLON.getLowestUnitValue(1.0);
        double val = quantityMeasurement.getVolumeConversion(inchValue, UnitType.LITRES);
        Assert.assertEquals(3.785, val, 0);
    }

    @Test
    public void whenGivenOneLitre_shouldReturnInMililitres() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double value1 = UnitType.LITRES.getLowestUnitValue(1.0);
        double value2 = quantityMeasurement.getVolumeConversion(value1, UnitType.ML);
        Assert.assertEquals(1000.0, value2, 0);
    }

    @Test
    public void whenGivenOneKg_shouldReturnThousandGrams() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double value1 = UnitType.KILOGRAM.getLowestUnitValue(1.0);
        double value2 = quantityMeasurement.getWeightConversion(value1, UnitType.GRAM);
        Assert.assertEquals(1000.0, value2, 0);
    }

    @Test
    public void whenGivenOneTonee_shouldReturnThousandKgs() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double value1 = UnitType.TONNE.getLowestUnitValue(1.0);
        double value2 = quantityMeasurement.getWeightConversion(value1, UnitType.KILOGRAM);
        Assert.assertEquals(1000.0, value2, 0);
    }

    @Test
    public void whenGivenFahrenheit_shouldReturnCelcius() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double value1 = UnitType.FARHANHIT.getLowestUnitValue(212.0);
        double value2 = quantityMeasurement.getTemperatureConversion(value1,UnitType.CELCIUS);
        Assert.assertEquals(100, value2, 0);
    }
}
