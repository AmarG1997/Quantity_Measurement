package quantity_measurement;

import java.util.Objects;

public class LengthMeasurement {

    private Units units;

    public enum Units{FEET,INCH,FEET_TO_YARD}

    public Double value;

    public LengthMeasurement(Double value,Units units) {
        this.units=units;
        this.value = value;
    }

    public LengthMeasurement() {
    }

    public double getConversion(Double value, Units units){
        if (units.equals(Units.FEET)){
             value=value*12;
        }
        if (units.equals(Units.INCH)){
            value=value/12;
        }
        if (units.equals(Units.FEET_TO_YARD)){
            value=value/3;
        }
        return value;
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



