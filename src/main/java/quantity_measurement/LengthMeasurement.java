package quantity_measurement;

import java.util.Objects;

public class LengthMeasurement {

    public Units units;

    public LengthMeasurement(Double v, Units feet) {

    }

    public LengthMeasurement() {
    }

    public enum Units{FEET,INCH,FEET_TO_YARD,INCH_TO_YARD}

    public double getConversion(Double value, Units units){
        UnitConversion unitConversion = new UnitConversion();
        double conversion = unitConversion.getConversion(value, units);
        return conversion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LengthMeasurement)) return false;
        LengthMeasurement that = (LengthMeasurement) o;
        return units == that.units &&
                Objects.equals(units, that.units);
    }

    @Override
    public int hashCode() {

        return Objects.hash(units, units);
    }
}



