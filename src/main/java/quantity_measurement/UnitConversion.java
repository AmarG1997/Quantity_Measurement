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
        if (units.equals(QuantityMeasurement.Units.CM)){
            value= Double.valueOf(Math.round(value*2.54));
        }
        if (units.equals(QuantityMeasurement.Units.LITRE)){
            value = value/1000;
        }
        if (units.equals(QuantityMeasurement.Units.GALLON)){
            value = value/3785;
        }
        if (units.equals(QuantityMeasurement.Units.ML)){
            value = value/1;
        }
        if (units.equals(QuantityMeasurement.Units.TONNE)){
            value = value/1000;
        }
        if (units.equals(QuantityMeasurement.Units.KILOGRAM)) {
            value = value/1000;
        }
        if (units.equals(QuantityMeasurement.Units.GRAM)) {
            value = value*1;
        }
        if (units.equals(QuantityMeasurement.Units.CELCIUS)) {
            value = (value-32) * 5/9 ;
        }

        return value;
    }
}

