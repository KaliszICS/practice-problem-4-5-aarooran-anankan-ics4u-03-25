/**
 * Handles the information (name, age, student number) of students, returning said information and checking to see if two students match
 * @author Aarooran Anankan
 * @version 1.0
 */

class Student {

    //Instance Variables
    private String name;
    private int age;
    private String studentNumber;

    /**
     * Constructor that sets the values of the instance variables to that of the parameters
     * @param name the name of the student
     * @param age the age of the student
     * @param studentNumber the student number of the student
     */
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /**
     * A getter that get's the student's name
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * A getter that get's the student's age
     * @return
     */
    public int getAge() {
        return this.age;
    }

    /**
     * A getter that get's the student's student number
     * @return
     */
    public String getStudentNumber() {
        return this.studentNumber;
    }

    @Override
    /**
     * Returns "name, age - student number"
     */
    public String toString() {
        return this.name + ", " + this.age + " - " + this.studentNumber;
    }

    @Override
    /**
     * Returns true if the student number of two students match, false otherwise
     */
    public boolean equals(Object obj) {
        
        if(obj == null || !obj.getClass().equals(this.getClass())) {
            return false;
        }
        
        Student student = (Student)obj;
        if(student.getStudentNumber().equals(this.studentNumber)) {
            return true;
        }
        
        return false;
    }
 }