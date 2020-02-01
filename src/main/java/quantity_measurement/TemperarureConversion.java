package quantity_measurement;

public class TemperarureConversion implements IConversion {
    @Override
    public double getConversion(Double value, UnitType units) {
        if (units.equals(UnitType.FARHANHIT)||units.equals(UnitType.CELCIUS)){
            value=value/units.val;
            return value;
        }
        throw new RuntimeException("Enter Valid Units");
    }
}
