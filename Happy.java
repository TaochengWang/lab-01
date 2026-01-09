import java.util.Date;

// A concrete happy mood
public class Happy extends Mood {

    // Default constructor: uses current date
    public Happy() {
        super();
    }

    // Constructor with a specific date
    public Happy(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "I feel happy!";
    }
}
