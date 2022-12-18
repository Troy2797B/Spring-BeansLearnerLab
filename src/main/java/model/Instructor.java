package model;

import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Instructor extends Person implements Teacher{
    public Instructor(Long id) {
        super(id);
    }

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    //written two different ways because i thought my stream was messed up...
    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
//        int counter = 0;
//        for (Learner stu : learners){
//            counter++;
//        }
//        double numberOfHoursPerLearner = numberOfHours / counter;
//        for(Learner stu : learners){
//            stu.learn(numberOfHoursPerLearner);
//        }
        //I want to use a stream to challenge myself
        //first convert to Spliterator
        Spliterator<? extends Learner> spliterator = learners.spliterator();
        //getting a stream from spliterator
        Stream<? extends Learner> stream = StreamSupport.stream(spliterator, false);
        double length = (double) stream.count();
        double numberOfHoursPerLearner = numberOfHours / length;
        Spliterator<? extends Learner> split = learners.spliterator();
        Stream<? extends Learner> stream1 = StreamSupport.stream(spliterator, false);
        stream1.forEach(learner -> learner.learn(numberOfHoursPerLearner));
    }
}
