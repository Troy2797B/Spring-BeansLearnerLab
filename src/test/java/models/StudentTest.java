package models;

import model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    //not testing getter right now

    @Test
    public void learnTest(){
        //given number of hours and a student
        Student stu = new Student(9L, "Amelia", 40);
        double numberOfHours = 12;
        //when you make a student learn for the given number of hours
        stu.learn(12);
        //then the total time should be increased by the learn time
        double expected = 52;
        double actual = stu.getTotalStudyTime();
        assertEquals(expected, actual);
    }
}
