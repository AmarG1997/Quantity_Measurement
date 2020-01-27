package quantity_measurement;

import java.util.Objects;

public class Feet {

    public Double value;

    public Feet(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feet)) return false;
        Feet feet = (Feet) o;
        return Objects.equals(value, feet.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
