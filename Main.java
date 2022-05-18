package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher lizzy = new Teacher(1, "Lizzy", 5000);
        Teacher kasun = new Teacher(2, "Kasun", 7000);
        Teacher kusal = new Teacher(3, "Kusal", 9000);

        List<Teacher> teacherList = new ArrayList<>();
        List<Teacher> teacherList1 = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(kasun);
        teacherList.add(kusal);

        Student nuwantha = new Student(10, "Nuwantha", 85);
        Student gayan = new Student(11, "Gayan", 95);
        Student supun = new Student(12, "Supun",75);

        List<Student> studentList = new ArrayList<>();
        studentList.add(nuwantha);
        studentList.add(gayan);
        studentList.add(supun);

        School sch = new School(teacherList,studentList);

        Teacher akalanka = new Teacher(4,"Akalanka",2500);
        sch.addTeachers(akalanka);

        nuwantha.updateFeesPaid(12000);
        System.out.println(sch.getTotalMoneyEarn());

        System.out.println("-----Making School Pay Salary-----");
        lizzy.receiveSalary(lizzy.getSalary());

        System.out.println("School has spent salary to " + lizzy.getName() +
                " and now has " + sch.getTotalMoneyEarn());
        kasun.receiveSalary(kasun.getSalary());
        System.out.println("School has spent salary to " + kasun.getName() +
                " and now has " + sch.getTotalMoneyEarn());
        kusal.receiveSalary(kasun.getSalary());
        akalanka.receiveSalary(akalanka.getSalary());
        System.out.println(nuwantha);
        System.out.println(lizzy);
        System.out.println(kusal);
        System.out.println(akalanka);
    }
}
