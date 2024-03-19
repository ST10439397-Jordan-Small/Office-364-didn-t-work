/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package office.pkg364.didn.t.work;

/**
 *
 * @author jorda
 */
public class StudentClass
{
   
    //Students Details(Attributes)
    private int StudentID;
    private String firstName;
    private String lastName;
    private int age;
    private double GPA;

    //Methods
    //General Constructor
    public StudentClass() 
    {}
    
    //Master Constructor
    public StudentClass(int StudentID, String firstName, String lastName, int age, double GPA) 
    {
    
        this.StudentID = StudentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.GPA = GPA;
    }
    

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    //Method to print of the details of a student
    public void PrintDetails()
    {
        System.out.println("Students' ID number: " + StudentID);
        System.out.println("Students' First name: " + firstName);
        System.out.println("Students' Last name: " + lastName);
        System.out.println("Students' age: " + age);
        System.out.println("Students' GPA score: " + GPA);
    
    }        
    
    
    
    
    
    
//---------------------End of File----------------------------------------//    
}
