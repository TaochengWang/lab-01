import java.util.Date;

// A concrete sad mood
public class Sad extends Mood {

    // Default constructor: uses current date
    public Sad() {
        super();
    }

    // Constructor with a specific date
    public Sad(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "I feel sad.";
    }
}
