package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student implements Comparable<Student> {

        private Integer numberOfExamsScores;
        private String firstName;
        private String lastName;
        private ArrayList<Double> examScores;

            public Student(String firstName, String lastName, ArrayList < Double > examScores) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.examScores = examScores;
        }

        public void setFirstName (String firstName){
            this.firstName = firstName;
        }

        public void setLastName (String lastName){
            this.lastName = lastName;
        }

        public void setExamScores (ArrayList < Double > examScores) {
            this.examScores = examScores;
        }

        public String getFirstName () {
            return this.firstName;
        }

        public String getLastName () {
            return this.lastName;
        }


        public String getExamScores () {
            StringBuilder examScoresFormatted = new StringBuilder();
            examScoresFormatted.append("Exam Scores: ");
            for (int i = 0; i < examScores.size(); i++) {
         //       examScoresFormatted.append("\n\t Exam " + (i + 1) + " -> " + Math.round(testScores[i]));
            }
            return examScoresFormatted.toString();
        }

        public void addExamScore ( double examScore){
            examScores.add(examScore);
        }

        public void setExamScore (ArrayList < Double > examNumber,double newScore){
            this.examScores = examNumber;
        }

        public Integer getNumberOfExamScores () {
            return 0;
        }

          public Double getAverageExamScore() {

              return null;
          }


        @Override
        public int compareTo(Student o) {
            if (this.getAverageExamScore() > o.getAverageExamScore()) {
                return 1;
            }
            else if (this.getAverageExamScore() < o.getAverageExamScore())    {
                return -1;
            }
            else {
                return 0;
            }
        }
}

