package quantity_measurement;

import java.util.Objects;

public class LengthMeasurement {

    private Units units;

    public enum Units{FEET,INCH}

    public Double value;

    public LengthMeasurement(Double value) {
        this.value = value;
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



