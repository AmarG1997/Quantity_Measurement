package quantity_measurement;

import java.util.Objects;

public class QuantityMeasurement {

    public Units units;

    public QuantityMeasurement(Double value, Units feet) {

    }

    public QuantityMeasurement() {
    }

    public enum Units{INCH,FEET,YARD,CM}

    public double getConversion(double value, Units units){
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



