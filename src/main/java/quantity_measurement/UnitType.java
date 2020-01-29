package quantity_measurement;

public enum  UnitType {

    FEET(12),
    INCH(1),
    YARD(36),
    CM(1/2.54),
    LITRES(1000),
    GALLON(3785),
    ML(1);
    double val;

    UnitType(double i) {
        this.val=i;
    }

    public double getInchValue(double value){

       double val1=this.val*value;

        return val1;
    }
}