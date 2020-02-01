package quantity_measurement;

public class WeightConversion implements IConversion {
    @Override
    public double getConversion(Double value, UnitType units) {
        if (units.equals(UnitType.KILOGRAM)||units.equals(UnitType.GRAM)||units.equals(UnitType.TONNE)){
            value=value/units.val;
            return value;
        }
        throw new RuntimeException("Enter Valid Units");
    }
}
