package quantity_measurement;

public class UnitConversion {


    public double getConversion(Double value, QuantityMeasurement.Units units) {
        if (units.equals(QuantityMeasurement.Units.FEET)){
            value=value/12;
        }
        if (units.equals(QuantityMeasurement.Units.YARD)){
            value=value/36;
        }
        if (units.equals(QuantityMeasurement.Units.INCH)){
            value=value/1;
        }

        return value;
    }
}

