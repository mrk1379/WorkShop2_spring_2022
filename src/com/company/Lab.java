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

    //object from AcademicStaff Class
    private AcademicStaff academicStaff;

    //number of students in college
    private int numberStudent;

    //capacity of students in  college
    private int capacityStud;

    //avg grade of college students
    private int avgOflab;

    //the day lab is held
    private String dayOfWeek;

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
     * method for setting number of students
     * @param numF
     */
    public void setNumberStudent(int numF) {
        numberStudent = numF;
    }

    /**
     * method for setting number of students
     */
    public int getNumberStudent() {
        return numberStudent;
    }

    /**
     * method for setting max number of students
     * @param cap
     */
    public void setcap(int cap) {
        capacityStud = cap;
    }

    /**
     * method for getting max number of students
     */
    public int getcap() {
        return capacityStud;
    }


    /**
     * method for setting day of week
     * @param dOWeek
     */
    public void setDayOfWeek(String dOWeek) {
        dayOfWeek = dOWeek;
    }

    /**
     * method for getting day of week
     */
    public String getDayOfWeek() {
        return dayOfWeek;
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
    public void enrollAcademicstaff(AcademicStaff as){
        academicStaff = as;
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
    /**
     * method for printing lab info
     */
    public void print() {
        System.out.println("Nam ostad: "+academicStaff.getFullName() + "  zarfiat: " +capacityStud+ " zaman bargozari: "+ dayOfWeek + "  avg of lab: "+ calecAvg() );
    }


}
