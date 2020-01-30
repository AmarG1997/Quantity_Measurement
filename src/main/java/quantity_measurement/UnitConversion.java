package quantity_measurement;

public class UnitConversion {

    public double getConversion(Double value, UnitType units) {
        value=value/units.val;
        return value;
    }
}

