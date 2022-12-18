package models;

import model.Instructor;
import model.Learner;
import model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InstructorTest {

    @Test
    public void teachTest(){
        //given a learner and a teacher
        Student student = new Student(1L, "Megan", 100);
        Instructor prof = new Instructor(2L);
        //when you call this method
        prof.teach(student, 10);
        //then the number of hours of the learner should go up
        double expected = 110;
        double actual = student.getTotalStudyTime();
        assertEquals(expected,actual);
    }

    @Test
    public void lectureTest(){
        //given a list of learners and a teacher
        ArrayList <Learner> learners = new ArrayList<Learner>();
        Student megan = new Student(1L, "Megan", 100);
        Student mercutio = new Student(2L, "Mercutio", 70);
        Student atreus = new Student(3L, "Atreus", 120);
        Instructor prof = new Instructor(2L);
        learners.add(megan);
        learners.add(mercutio);
        learners.add(atreus);

        //when the teacher gives a lecture for a number of hours
        prof.lecture(learners, 6);
        //then each student's totalStudyTime increases by the number of hours
        assertTrue(megan.getTotalStudyTime() == 102 && mercutio.getTotalStudyTime() == 72 && atreus.getTotalStudyTime() == 122);
    }
}
