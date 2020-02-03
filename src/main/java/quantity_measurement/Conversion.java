package quantity_measurement;

public abstract class Conversion {
    
    public abstract double getLengthConversion(Double value, UnitType units);
    public abstract double getTemperatureConversion(Double value, UnitType units);
    public abstract double getVolumeConversion(Double value, UnitType units);
    public abstract double getWeightConversion(Double value, UnitType units);
}
