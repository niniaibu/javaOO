package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String getKlassName() {
        if (klass != null) {
            return "Class " + klass.getNumber();
        } else {
            return "No Class";
        }
    }

    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + getKlassName() + ".";
    }


    public String introduceWith(Student student) {
        if (student.getKlass() == this.klass) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}