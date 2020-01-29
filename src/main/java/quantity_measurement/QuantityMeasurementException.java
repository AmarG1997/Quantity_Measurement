package quantity_measurement;

public class QuantityMeasurementException extends Exception{

    public enum ExceptionType {

        NULL_POINTER_EXCEPTION;
    }

    public ExceptionType type;


    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}