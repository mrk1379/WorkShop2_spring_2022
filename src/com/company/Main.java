package com.company;

/**
 * the main class of project
 * setting college cap and adding 2 stud + 2 academic staff(1 is more than cap)
 * print stud detail
 * print college avg
 *
 * @author Mohammad Reza Karimi
 * @version 1.0
 * @since 2020-10-9
 *
 */


public class Main {


    /**
     * main body
     * @param args
     */

    public static void main(String[] args) {

        /**
         * making test object from classes
         * 1 collese
         * 2 stud + 2 AcademicStaff
         */

        //main college object
     //   College myCollege = new College(1,3);


        Lab myLab = new Lab(3);
        Lab myLab2 = new Lab(3);
        //2  test object from student class

        Student stud1 = new Student("james","Gosling",9831119,"bachlor",18);
        Student stud2 = new Student("ali","nami",9817456,"master",20);

        //2 test object from academicstaff class
        AcademicStaff  aS1= new AcademicStaff("Ali","Nori");
        AcademicStaff  aS2= new AcademicStaff("Iraj","Bagheri");

         /**
         * using method set grade to change the grade of stud2
        */
        stud2.setGrade(14);

        //adding stud and as
        myLab.enrollStudent(stud1);
        myLab.enrollStudent(stud2);

        //only 1 stud to second lab to check avg
        myLab2.enrollStudent(stud2);

        //
        myLab.setDayOfWeek("Monday");
        myLab2.setDayOfWeek("sunday");



        //print detail of stud1
        stud1.print();

        //setting as1 rank
        aS1.setRank("danesh yar");

        myLab.enrollAcademicstaff(aS1);
        myLab2.enrollAcademicstaff(aS2);

        //print avg of college using calecAvg method from class College
        System.out.println("avg of lab1 = "+myLab.calecAvg());
        System.out.println("avg of lab2 = "+myLab2.calecAvg());

        myLab.print();


    }


}