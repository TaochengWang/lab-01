import java.util.Date;

// Abstract base class representing a mood
public abstract class Mood {
    private Date date;

    // Default constructor: use current date
    public Mood() {
        this.date = new Date();
    }

    // Constructor with a specific date
    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Each concrete mood must describe itself
    public abstract String getMood();
}
