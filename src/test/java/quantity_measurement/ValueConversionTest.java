package quantity_measurement;

import org.junit.Assert;
import org.junit.Test;

public class ValueConversionTest {

    @Test
    public void whenGivenOneFeetAndOneInch_shouldReturnEquals() {
        LengthConversion lengthConversion = new LengthConversion();
        double first = lengthConversion.getConversion(0.0, UnitType.FEET);
        double second = lengthConversion.getConversion(0.0, UnitType.INCH);
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
        LengthConversion lengthConversion = new LengthConversion();
        double inchValue = UnitType.FEET.getLowestUnitValue(1.0);
        double val = lengthConversion.getConversion(inchValue, UnitType.YARD);
        Assert.assertTrue(inchValue != val);
    }

    @Test
    public void whenGivenThreeFeet1_shouldReturnOneYard() {
        LengthConversion lengthConversion = new LengthConversion();
        double inchValue = UnitType.FEET.getLowestUnitValue(3.0);
        double val = lengthConversion.getConversion(inchValue,UnitType.YARD);
        Assert.assertEquals(1, val, 0);
    }

    @Test
    public void whenGivenOneGallon_shouldReturnInLitres() {
        VolumeConversion volumeConversion = new VolumeConversion();
        double inchValue = UnitType.GALLON.getLowestUnitValue(1.0);
        double val = volumeConversion.getConversion(inchValue, UnitType.LITRES);
        Assert.assertEquals(3.785, val, 0);
    }

    @Test
    public void whenGivenOneLitre_shouldReturnInMililitres() {
        VolumeConversion volumeConversion = new VolumeConversion();
        double value1 = UnitType.LITRES.getLowestUnitValue(1.0);
        double value2 = volumeConversion.getConversion(value1, UnitType.ML);
        Assert.assertEquals(1000.0, value2, 0);
    }

    @Test
    public void whenGivenOneKg_shouldReturnThousandGrams() {
        WeightConversion weightConversion = new WeightConversion();
        double value1 = UnitType.KILOGRAM.getLowestUnitValue(1.0);
        double value2 = weightConversion.getConversion(value1, UnitType.GRAM);
        Assert.assertEquals(1000.0, value2, 0);
    }

    @Test
    public void whenGivenOneTonee_shouldReturnThousandKgs() {
        WeightConversion weightConversion = new WeightConversion();
        double value1 = UnitType.TONNE.getLowestUnitValue(1.0);
        double value2 = weightConversion.getConversion(value1, UnitType.KILOGRAM);
        Assert.assertEquals(1000.0, value2, 0);
    }

    @Test
    public void whenGivenFahrenheit_shouldReturnCelcius() {
        TemperarureConversion temperarureConversion = new TemperarureConversion();
        double value1 = UnitType.FARHANHIT.getLowestUnitValue(212.0);
        double value2 = temperarureConversion.getConversion(value1,UnitType.CELCIUS);
        Assert.assertEquals(100, value2, 0);
    }
}
