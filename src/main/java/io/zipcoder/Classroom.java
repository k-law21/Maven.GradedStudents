package io.zipcoder;

import java.util.*;


public class Classroom {
    private ArrayList<Student> students;
    private Integer maxNumberOfStudents;
    public Classroom(Integer maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }
    public Classroom(ArrayList <Student> students) {
        this.students = students;
    }
    public Classroom() {
        this.students = new ArrayList<>(30);
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public Double getAverageExamScore() {
        Double sum = 0.0;
        for (Student s: students
        ) {
            sum += s.getAverageExamScore();
        }
        return sum/students.size();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(String firstName, String lastName) {
        for (Student s: students
        ) {
            if(s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)) {
                students.remove(s);
            }
        }
    }
    public void getStudentsByScore() {
        Collections.sort(students);
    }
    public HashMap<Student,String> getGradeBook() {
        HashMap <Student,String> hm = new HashMap<>();
        for (Student s: students
        ) {
            Double R = s.getAverageExamScore()/100 * (students.size() +1);
            if ((R)<10) {
                hm.put(s,"A");
            }
            else if ( R > 11 && R <29 ) {
                hm.put(s,"B");
            }
            else if ( R > 30 && R <50 ) {
                hm.put(s,"C");
            }
            else if ( R > 51 && R <89 ) {
                hm.put(s,"C");
            }
            else {
                hm.put(s,"F");
            }
        }
        return hm;
    }
}







