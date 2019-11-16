package io.zipcoder;

import org.junit.Assert;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StudentTest {
    ArrayList <Double> arr = new ArrayList<>(10);

    @Test
    public void constructorWith3Params() {

        Student student = new Student("A","B", this.arr);
        String expected = "A";
        String actual = student.getFirstName();
        Assert.assertEquals(expected,actual);
        arr.clear();
    }

    @Test
    public void getExamScoreTest() {
        arr.add(100.0);
        Student student = new Student("A","B", this.arr);
        String expected = "\tExam + "+ arr.size() +" + -> " + 100.0 + "\n";
        String actual  = student.getExamScores();
        Assert.assertEquals(expected,actual);
        arr.clear();
    }

    @Test
    public void addExamScoreTest() {
        arr.add(100.0);
        Student student = new Student("A","B", this.arr);
        Double expected = 100.00;
        student.addExamScore(100.00);
        Double actual = student.getAverageExamScore();
        Assert.assertEquals(expected,actual);
        arr.clear();
    }

    @Test
    public void setExamScoreTest() {
        arr.add(100.0);
        Student student = new Student("A","B", this.arr);
        Double expected = 100.00;
        Double actual = student.getAverageExamScore();
        Assert.assertEquals(expected,actual);
        arr.clear();
    }

    @Test
    public void name() {
    }
}