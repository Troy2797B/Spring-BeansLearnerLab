package model;

public class Student extends Person implements Learner{

    public double totalStudyTime;

    public Student(Long id) {
        super(id);
    }

    public Student(Long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
