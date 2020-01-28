package quantity_measurement;

import java.util.Objects;

public class QuantityMeasurement {

    public Units units;

    public QuantityMeasurement(Double value, Units feet) {

    }

    public QuantityMeasurement() {
    }

    public enum Units{FEET,INCH,FEET_TO_YARD,INCH_TO_YARD,YARD_TO_INCH,YARD_TO_FEET}

    public double getConversion(Double value, Units units){
        UnitConversion unitConversion = new UnitConversion();
        double conversion = unitConversion.getConversion(value, units);
        return conversion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuantityMeasurement)) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return units == that.units &&
                Objects.equals(units, that.units);
    }

    @Override
    public int hashCode() {

        return Objects.hash(units, units);
    }
}



