package practice10;

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
        if (student.getKlass() == this) {
            this.leader = student;
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public boolean isIn(Student student) {
        if (student.klass.number == this.number) {
            return true;
        }
        return false;
    }
}
