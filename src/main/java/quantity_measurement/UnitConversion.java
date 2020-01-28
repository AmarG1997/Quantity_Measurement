package quantity_measurement;

import sun.tools.jconsole.Plotter;

public class UnitConversion {

//    public Units units;
//
//    public enum Units{FEET,INCH,FEET_TO_YARD,INCH_TO_YARD}

//    public double getConversion(Double value, Units  units){
//        UnitConversion unitConversion = new UnitConversion();
//        double conversion = unitConversion.getConversion(value, units);
//        return conversion;
//    }

    public double getConversion(Double value, LengthMeasurement.Units units){
        if (units.equals(LengthMeasurement.Units.FEET)){
            value=value*12;
        }
        if (units.equals(LengthMeasurement.Units.INCH)){
            value=value/12;
        }
        if (units.equals(LengthMeasurement.Units.FEET_TO_YARD)){
            value=value/3;
        }
        if(units.equals(LengthMeasurement.Units.INCH_TO_YARD)){
            value=value/36;
        }
        return value;
    }
}

