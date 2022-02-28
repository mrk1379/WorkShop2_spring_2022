package com.company;
/**
 * class of lab
 * for adding student or academic staff
 * contain method for calculating avg of grades
 * contain functain to recall if the maximum number of studens  is reached
 * @author MohammadReza Karimi
 * @version 1.0
 *
 *
 */
public class Lab {
    //object from student class
    private Student[] students;

    //number of students in college
    private int numberStudent;

    //capacity of students in  college
    private int capacityStud;

    //avg grade of college students
    private int avgOflab;

    /**
     * main constructor of
     * the college class
     * will function on fallowing params with received data
     * @param capacityStud
     */
    public Lab(int capacityStud){
        this.students = new Student[capacityStud];
        this.capacityStud=capacityStud;
        numberStudent=0;
    }


    /**
     * adding student
     * enrol,=ment method
     * @param student
     */
    public void enrollStudent(Student student){

        if(numberStudent<capacityStud){
            students[numberStudent] = student;
            //increasing current number
            numberStudent++;
        }else{
            System.out.println("max number !! cant add more student");
        }
    }

    /**
     * calculating avg grade of students in this college
     * @return int average number of students grades
     */

    public int calecAvg(){
        int sumOfgrades=0;
        for(int counter =0;counter<numberStudent;counter++){
            //calculating sum
            sumOfgrades = students[counter].getGrade() + sumOfgrades;
        }
        //assigning the avg
        this.avgOflab = (sumOfgrades/numberStudent);
        return this.avgOflab;
    }


}
