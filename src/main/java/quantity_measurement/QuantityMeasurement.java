package quantity_measurement;

import java.util.Objects;

public class QuantityMeasurement {

    private Units units;

    public enum Units{FEET,INCH}

    public Double value;

    public QuantityMeasurement(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuantityMeasurement)) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return units == that.units &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(units, value);
    }
}



