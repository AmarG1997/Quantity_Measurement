package quantity_measurement;

import java.util.Objects;

public class QuantityMeasurement {

    public Units units;

    public QuantityMeasurement(Double value, Units feet) {

    }

    public QuantityMeasurement() {
    }

    public enum Units{INCH,FEET,YARD,CM,ML,LITRE,GALLON,KILOGRAM,TONNE,GRAM,CELCIUS,FAHRENHEIT}

    public double getConversion(double value,UnitType units){
        UnitConversion unitConversion = new UnitConversion();
        double conversion = unitConversion.getConversion(value, units);
        return conversion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof QuantityMeasurement)) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        this.units=that.units;
        return units == that.units && this.units == that.units &&
                Objects.equals(units, that.units);
    }

    public double getAddition(double val,double value){
        double additionResult =val+value;
        return additionResult;
    }
}



