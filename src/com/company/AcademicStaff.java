package com.company;

/**
 * @author MohanmmadReza Karimi
 * @version 1.0
 * AcademicStaff class
 * base info of AcademicStaff
 * contain methods for changing or setting rank of AcademicStaff
 *
 */
public class AcademicStaff {

    /**
     * primitive data type of AcademicStaff class
     * contains personal info
     */

    //name of the AcademicStaff
    private String name;

    //Last Name of the AcademicStaff
    private String lastName;

    //rank of the AcademicStaff
    private String rank;

    /**
     * constructor of AcademicStaff class
     * @param name
     * @param lastName
     * will assign data to name and last name
     */
    public AcademicStaff(String name,String lastName){
        /**
         *
         */
        this.name=name;
        this.lastName=lastName;


    }

    /**
     * setter for changing AcademicStaffs rank
     * @param rank
     */
    public void setRank(String rank){
        this.rank=rank;
    }

    /**
     *
     * @return Lastname
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;

    }

    public String getFullName() {
        return name+" "+lastName;
    }

}