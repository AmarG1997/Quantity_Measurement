package quantity_measurement;

import java.util.Objects;

public class QuantityMeasurement extends Conversion{

    public Units units;
    String unitType;

    public QuantityMeasurement(Double value, Units feet,String unitType) {
        this.unitType = unitType;
    }

    public QuantityMeasurement() {
    }

    @Override
    public double getLengthConversion(Double value, UnitType units) {
        {
            if (units.equals(UnitType.INCH) || units.equals(UnitType.FEET) || units.equals(UnitType.YARD) ||units.equals(UnitType.CM)){
                value=value/units.val;
                return value;
            }
            throw new RuntimeException("Enter Valid Units");
        }
    }

    @Override
    public double getTemperatureConversion(Double value, UnitType units) {
        if (units.equals(UnitType.FARHANHIT)||units.equals(UnitType.CELCIUS)){
            value=value/units.val;
            return value;
        }
        throw new RuntimeException("Enter Valid Units");
    }

    @Override
    public double getVolumeConversion(Double value, UnitType units) {
        if (units.equals(UnitType.LITRES)||units.equals(UnitType.ML)||units.equals(UnitType.GALLON)){
            value=value/units.val;
            return value;
        }
        throw new RuntimeException("Enter Valid Units");
    }

    @Override
    public double getWeightConversion(Double value, UnitType units) {
        if (units.equals(UnitType.KILOGRAM)||units.equals(UnitType.GRAM)||units.equals(UnitType.TONNE)){
            value=value/units.val;
            return value;
        }
        throw new RuntimeException("Enter Valid Units");
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



