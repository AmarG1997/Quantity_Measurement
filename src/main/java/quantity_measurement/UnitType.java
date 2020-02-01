package quantity_measurement;

public enum  UnitType {
    FEET(12,"LENGTH"),
    INCH(1,"LENGTH"),
    YARD(36,"LENGTH"),
    CM(1/2.54,"LENGTH"),
    LITRES(1000,"VOLUME"),
    GALLON(3785,"VOLUME"),
    ML(1,"VOLUME"),
    TONNE(1000000,"WEIGHT"),
    KILOGRAM(1000,"WEIGHT"),
    GRAM(1,"WEIGHT"),
    FARHANHIT(1,"TEMPERATURE"),
    CELCIUS(2.12,"TEMPERATURE");

    public double val;
    public String unitType;

    UnitType(double val, String unittype) {
        this.val = val;
        this.unitType = unittype;
    }

    public double getLowestUnitValue(double value){
       double val1=this.val*value;
       return val1;
    }
}