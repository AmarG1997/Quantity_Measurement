package quantity_measurement;

import java.util.Objects;

public class QuantityMeasurement {

    public Units units;
    String unitType;

    public QuantityMeasurement(Double value, Units feet,String unitType) {
        this.unitType = unitType;
    }

    public QuantityMeasurement() {
    }

    public enum Units{INCH,FEET}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof QuantityMeasurement)) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        this.units=that.units;
        return units == that.units && this.units == that.units && this.unitType.equals(that.unitType)&&
                Objects.equals(units, that.units);
    }

    public double getAddition(double val,double value){
        double additionResult =val+value;
        return additionResult;
    }

}



