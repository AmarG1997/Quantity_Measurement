package quantity_measurement;

import org.junit.Assert;
import org.junit.Test;

public class OperationsTest {

    @Test
    public void whenGivenTwoInch_shouldReturnFiveCentimeter() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.INCH.getTypeValue(2.0);
        double val = Math.round(lengthMeasurement.getConversion(inchValue, UnitType.CM));
        Assert.assertEquals(5, val, 0);
    }

    @Test
    public void whenGivenTwoInchAndTwoInch_shouldReturnFour() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.INCH.getTypeValue(2.0);
        double inchValue1 = UnitType.INCH.getTypeValue(2.0);
        double result = lengthMeasurement.getAddition(inchValue, inchValue1);
        Assert.assertEquals(4, result, 0);
    }

    @Test
    public void whenGivenOneFetAndTwoInch_shouldReturnFourteenInches() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.FEET.getTypeValue(1.0);
        double inchValue1 = UnitType.INCH.getTypeValue(2.0);
        double result = lengthMeasurement.getAddition(inchValue, inchValue1);
        Assert.assertEquals(14, result, 0);
    }

    @Test
    public void whenGivenOneFeetAndOneFeet_shouldReturnTwentyFourInches() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.FEET.getTypeValue(1.0);
        double inchValue1 = UnitType.FEET.getTypeValue(1.0);
        double result = lengthMeasurement.getAddition(inchValue, inchValue1);
        Assert.assertEquals(24, result, 0);
    }

    @Test
    public void whenGivenTwoInchAndTwoPointFiveCm_shouldReturnThreeInches() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double inchValue = UnitType.INCH.getTypeValue(2.0);
        double inchValue1 = UnitType.CM.getTypeValue(2.54);
        double result = lengthMeasurement.getAddition(inchValue, inchValue1);
        Assert.assertEquals(3.0, result, 0);
    }

    @Test
    public void whenGivenGallonAndLitres_shouldReturnLitres() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double value = UnitType.GALLON.getTypeValue(1.0);
        double value1 = UnitType.LITRES.getTypeValue(3.785);
        double result = lengthMeasurement.getAddition(value, value1);
        double litreResult = lengthMeasurement.getConversion(result, UnitType.LITRES);
        Assert.assertEquals(7.57, litreResult, 0);
    }

    @Test
    public void whenGivenLitreAndMililitre_shouldReturnLitres() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double value = UnitType.LITRES.getTypeValue(1.0);
        double value1 = UnitType.ML.getTypeValue(1000.0);
        double result = lengthMeasurement.getAddition(value, value1);
        double litreResult = lengthMeasurement.getConversion(result, UnitType.LITRES);
        Assert.assertEquals(2.0, litreResult, 0);
    }

    @Test
    public void whenGivenTonneAndGram_shouldReturnKilogram() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double value = UnitType.TONNE.getTypeValue(1.0);
        double value1 = UnitType.GRAM.getTypeValue(1000.0);
        double result = lengthMeasurement.getAddition(value, value1);
        double litreResult = lengthMeasurement.getConversion(result, UnitType.KILOGRAM);
        Assert.assertEquals(1001.0, litreResult, 0);
    }
}
