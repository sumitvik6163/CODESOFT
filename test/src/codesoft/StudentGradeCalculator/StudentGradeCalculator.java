package codesoft.StudentGradeCalculator;

import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter Student Name : ");
      String name = sc.nextLine();
      System.out.println("Please enter English marks : ");
      int eng = sc.nextInt();
       System.out.println("Please enter Mathmatics marks : ");
      int maths = sc.nextInt();
       System.out.println("Please enter Physics marks : ");
      int phy = sc.nextInt();
       System.out.println("Please enter Chemistry marks : ");
      int chem = sc.nextInt();
       System.out.println("Please enter Computer Science marks : ");
      int cS = sc.nextInt();
      
      int sumOfMarks = eng+maths+phy+chem+cS;
      int avgPercentMarks = sumOfMarks/5;
      String grade = "F";
      
      if(avgPercentMarks > 90){
          grade = "A+";
      }
       else if(avgPercentMarks > 80){
          grade = "A";
      }
       else if(avgPercentMarks > 70){
          grade = "B+";
      }
      else if(avgPercentMarks > 60){
          grade = "B";
      }
       else if(avgPercentMarks > 50){
          grade = "C";
      }
      else if(avgPercentMarks > 40){
          grade = "D";
      }
       else if(avgPercentMarks > 30){
          grade = "E";
      }
      else {
          grade = "F";
      }
      
      System.out.println("Name : "+name);
      System.out.println("**********Marks***********");
      System.out.println("English : "+eng);
      System.out.println("Mathmatics : "+maths);
      System.out.println("Physics : "+phy);
      System.out.println("Chemistry : "+chem);
      System.out.println("Computer Science : "+cS);
      System.out.println("\nTotal Marks : 500");
      System.out.println("Obtained Marks : "+sumOfMarks);
      System.out.println("Percentage : "+avgPercentMarks+"%");
      System.out.println("Grade : "+grade);
      
  }
}