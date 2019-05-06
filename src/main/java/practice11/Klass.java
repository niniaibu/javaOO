package practice11;

public class Klass {
    private int number;
    private Student leader;
    private AssignLeader assignLeader;
    private AppendMember appendMember;

    public Klass(int number) {
        this.number = number;
    }

    public void addAssignLeader(AssignLeader assignLeader) {
        this.assignLeader = assignLeader;
    }

    public void addAppendMember(AppendMember appendMember) {
        this.appendMember = appendMember;
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
            if (assignLeader != null) {
                assignLeader.assignLeaderOutput(student, this);
            }
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        if (appendMember != null) {
            appendMember.appendMemberOutput(student, this);
        }
    }

    public boolean isIn(Student student) {
        if (student.klass.number == this.number) {
            return true;
        }
        return false;
    }
}
