package school.management.system;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarn;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
         totalMoneyEarn = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * add teachers to the list
     * @param teacher is to be added.
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * add student to the school
     * @param student is to be added.
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earn by the school.
     */
    public int getTotalMoneyEarn() {
        return totalMoneyEarn;
    }

    /**
     * add the total money earned by the school.
     * @param moneyEarn money that suppose to be added.
     */
    public static void updateTotalMoneyEarn(int moneyEarn) {
         totalMoneyEarn += moneyEarn;
    }

    /**
     *
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * add total money spent by the school.
     * @param MoneySpent is the money suppose to be spent
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarn -= MoneySpent;
    }
}
