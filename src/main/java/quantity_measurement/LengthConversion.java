package quantity_measurement;

public class LengthConversion implements IConversion {

    @Override
    public double getConversion(Double value, UnitType units) {
        if (units.equals(UnitType.INCH) || units.equals(UnitType.FEET) || units.equals(UnitType.YARD) ||units.equals(UnitType.CM))
        value=value/units.val;
        return value;
    }

}

