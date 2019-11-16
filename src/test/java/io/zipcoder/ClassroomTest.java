
package io.zipcoder;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;


public class ClassroomTest {

    @Test
    public void studentAddTest() {
        ArrayList <Double> arr = new ArrayList<>(10);
        arr.add(100.00);
        Student s1 = new Student("A","B", arr);
        ArrayList<Student> students = new ArrayList<>();
        Classroom classroom = new Classroom(students);

        s1.addExamScore(100.00);
        classroom.addStudent(s1);
        Integer expected = 1;
        Integer actual = classroom.getStudents().size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeStudentTest() {
        ArrayList <Double> arr = new ArrayList<>(10);
        arr.add(100.00);
        Student s1 = new Student("A","B", arr);
        ArrayList<Student> students = new ArrayList<>();
        Classroom classroom = new Classroom(students);

        s1.addExamScore(200.00);
        classroom.addStudent(s1);
        classroom.addStudent(s1);
        classroom.removeStudent(s1.getFirstName(),s1.getLastName());
        Integer expected = 1;
        Integer actual = classroom.getStudents().size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getSortedTest() {
        ArrayList <Double> arr1 = new ArrayList<>(10);
        ArrayList <Double> arr2 = new ArrayList<>(10);
        ArrayList <Double> arr3 = new ArrayList<>(10);
        //arr.add(100.00);
        Student s1 = new Student("A","B", arr1);
        Student s2 = new Student("Z","Y", arr2);
        Student s3 = new Student("student","student", arr3);

        s1.addExamScore(100.00);
        s2.addExamScore(33.0);
        s3.addExamScore(0.0);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Classroom classroom = new Classroom(students);
        classroom.getStudentsByScore();

        Student expected = s3;
        Student actual = classroom.getStudents().get(0);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void gradeBookTest() {
        ArrayList <Double> arr1 = new ArrayList<>(10);
        ArrayList <Double> arr2 = new ArrayList<>(10);
        ArrayList <Double> arr3 = new ArrayList<>(10);
        //arr.add(100.00);
        Student s1 = new Student("Awww","B", arr1);
        Student s2 = new Student("Zz","Y", arr2);
        Student s3 = new Student("student","student", arr3);

        s1.addExamScore(100.00);
        s2.addExamScore(33.0);
        s3.addExamScore(0.0);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Classroom classroom = new Classroom(students);
        HashMap <Student, String> hashMap = classroom.getGradeBook();
        Boolean expected = hashMap.containsValue("A");
        Boolean actual = true;

        Assert.assertEquals(expected,actual);
    }
}
