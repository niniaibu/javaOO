package practice08;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        if (number != 0) {
            return "Class " + getNumber();
        } else {
            return "No Class";
        }
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }
}
