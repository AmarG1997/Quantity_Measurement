package quantity_measurement;

public class VolumeConversion implements IConversion {
    @Override
    public double getConversion(Double value, UnitType units) {
        if (units.equals(UnitType.LITRES)||units.equals(UnitType.ML)||units.equals(UnitType.GALLON)){
            value=value/units.val;
            return value;
        }
        throw new RuntimeException("Enter Valid Units");
    }
}
