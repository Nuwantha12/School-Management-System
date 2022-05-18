package school.management.system;

public class Student {
    /**
This class is responsible for keeping the track of students fees, name, grade and fees paid.
*/

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Constructor
     * To create a new student by initializing
     * @param id id for student: id is unique
     * @param name name for student
     * @param grade grade of a student
     * fees paid initially is 0.
     * fees for every student 30,000$ per year.
     */
    public Student(int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;


    }
    //not going to update student's name.

    /**
     * used to update student grade
     * @param grade new grade of the student.
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid field.
     * Add the fees to the fees paid.
     * The school is going receive the funds.
     * @param fees the fees that student pays.
     */
    public void updateFeesPaid(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarn(feesPaid);
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public int getFeesPaid(){
        return feesPaid;
    }
    public int getFeesTotal(){
        return feesTotal;
    }
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Name of the Teacher is " + name + " and he paid so far $ " + feesPaid;
    }
}
