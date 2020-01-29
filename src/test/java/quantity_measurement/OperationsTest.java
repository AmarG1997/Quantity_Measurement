package quantity_measurement;

import org.junit.Assert;
import org.junit.Test;

public class OperationsTest {


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

    @Test
    public void whenGivenGallonAndLitres_shouldReturnLitres() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double value = UnitType.GALLON.getInchValue(1.0);
        double value1 = UnitType.LITRES.getInchValue(3.785);
        double result= lengthMeasurement.getAddition(value, value1);
        double litreResult = lengthMeasurement.getConversion(result, QuantityMeasurement.Units.LITRE);
        Assert.assertEquals(7.57,litreResult,0);
    }

    @Test
    public void whenGivenLitreAndMililitre_shouldReturnLitres() {
        QuantityMeasurement lengthMeasurement = new QuantityMeasurement();
        double value = UnitType.LITRES.getInchValue(1.0);
        double value1 = UnitType.ML.getInchValue(1000.0);
        double result= lengthMeasurement.getAddition(value, value1);
        double litreResult = lengthMeasurement.getConversion(result, QuantityMeasurement.Units.LITRE);
        Assert.assertEquals(2.0,litreResult,0);
    }
}
