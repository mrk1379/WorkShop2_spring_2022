package com.company;

/**
 * class of college
 * for adding student or academic staff
 * contain method for calculating avg of grades
 * contain functain to recall if the maximum number of studens or staff is reached
 * @author MohammadReza Karimi
 * @version 1.0
 *
 *
 */

public class College {

    //object from student class
    private Lab[] labs;

    //object from Academic staff class
    private AcademicStaff[] academicStaffs;

    /**
     * primitive type datas
     */

    //number of students in college
    private int numberlabs;

    //number of staff in college
    private int numberStaff;

    //capacity of students in  college
    private int capacitylabs;

    //capacity of staff in  college
    private int capacityStaff;

    //avg grade of college students
    private int avgOfCollege;

    /**
     * main constructor of
     * the college class
     * will function on fallowing params with received data
     * @param capacityStaff
     * @param capacitylabs
     */
    public College(int capacityStaff,int capacitylabs){
        this.labs = new Lab[capacitylabs];
        this.academicStaffs = new AcademicStaff[capacityStaff];
        this.capacityStaff = capacityStaff;
        this.capacitylabs=capacitylabs;
        numberlabs=0;
        numberStaff = 0;
    }

    /**
     * adding student
     * enrol,=ment method
     * @param lab
     */
    public void enrolllab(Lab lab){

        if(numberlabs<capacitylabs){
            labs[numberlabs] = lab;
            //incresing current number
            numberlabs++;
        }else{
            System.out.println("max number !! cant add more student");
        }
    }

    /**
     * adding academic staff
     * checking cap for max number
     * @param academicStaff
     */

    public void enrollStaff(AcademicStaff academicStaff){
        if(numberStaff<capacityStaff){
            academicStaffs[numberStaff] = academicStaff;
            //increasing the current number
            numberStaff++;

        }else{
            System.out.println("max number !! cant add more academic staff");
        }

    }

    /**
     * calculating avg grade of students in this college
     * @return int average number of students grades
     */

    public int calecAvg(){
        int sumOfgrades=0;
        for(int counter =0;counter<numberlabs;counter++){
            //calculating sum
            sumOfgrades = labs[counter].calecAvg() + sumOfgrades;
        }
        //assigning the avg
        this.avgOfCollege = (sumOfgrades/numberlabs);
        return this.avgOfCollege;
    }



}
