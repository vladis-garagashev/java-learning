package month2.week1.day4;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        setName(name);
        setGrade(grade);

    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }
    public void setGrade(int grade) {
        if (grade < 0) {
            this.grade = 0;
        } else if (grade > 100) {
            this.grade = 100;
        } else {
            this.grade = grade;
        }
    }

    public void printInfo() {
        System.out.println(getInfo());
    }
    public String getInfo() {
        return name + ", grade: " + grade;
    }

    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
}
