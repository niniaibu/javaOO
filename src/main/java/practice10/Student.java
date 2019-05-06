package practice10;

public class Student extends Person {
    Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String isLeaderString() {
        if (this == klass.getLeader()) {
            return "Leader of ";
        } else {
            return "at ";
        }
    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am " + isLeaderString() + klass.getDisplayName() + ".";
    }
}

