package practice11;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person implements AppendMember, AssignLeader{
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass aClass : classes) {
            aClass.addAssignLeader(this);
            aClass.addAppendMember(this);
        }
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
        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student) {
        if (this.classes.contains(student.getKlass())) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    public void assignLeaderOutput(Student student, Klass klass) {
        String output = String.format("I am %s. I know %s become Leader of %s.",
                this.getName(), student.getName(), klass.getDisplayName());
        System.out.println(output);
    }

    public void appendMemberOutput(Student student, Klass klass) {
        String output = String.format("I am %s. I know %s has joined %s.",
                this.getName(), student.getName(), klass.getDisplayName());
        System.out.println(output);
    }

}

