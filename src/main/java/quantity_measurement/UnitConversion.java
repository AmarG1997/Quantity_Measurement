package quantity_measurement;

public class UnitConversion {


    public double getConversion(Double value, QuantityMeasurement.Units units){
        if (units.equals(QuantityMeasurement.Units.FEET)){
            value=value*12;
        }
        if (units.equals(QuantityMeasurement.Units.INCH)){
            value=value/12;
        }
        if (units.equals(QuantityMeasurement.Units.FEET_TO_YARD)){
            value=value/3;
        }
        if(units.equals(QuantityMeasurement.Units.INCH_TO_YARD)){
            value=value/36;
        }
        if (units.equals(QuantityMeasurement.Units.YARD_TO_INCH)){
            value=value*36;
        }
        if (units.equals(QuantityMeasurement.Units.YARD_TO_FEET)){
            value=value*3;
        }
        return value;
    }
}

