package practice07;

public class Klass {
    private int number;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        if (number != 0) {
            return "Class " + getNumber();
        } else {
            return "No Class";
        }
    }
}
