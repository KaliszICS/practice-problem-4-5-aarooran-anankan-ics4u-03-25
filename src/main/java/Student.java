/**
 * 
 */
class Student {

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
    public String toString() {
        return this.name + ", " + this.age + " - " + this.studentNumber;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student)obj;
        if()
        if(student.getStudentNumber().equals(this.studentNumber)) {
            return true;
        }
        return false;
    }
 }