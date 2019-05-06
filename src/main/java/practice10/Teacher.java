package practice10;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public String getClassesName() {
        if (classes != null) {
            String classesId = classes.stream()
                    .map(n -> String.valueOf(n.getNumber()))
                    .collect(Collectors.joining(", "));
            return "Class " + classesId;
        } else {
            return "No Class";
        }
    }

    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + getClassesName() + ".";
    }

    public boolean isTeaching(Student student) {
        return classes.stream().anyMatch(klass -> klass.isIn(student));
    }

    public String introduceWith(Student student) {
        if (this.classes.contains(student.getKlass())) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}
