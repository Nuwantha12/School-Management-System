package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create new teacher object
     * @param id id for new teacher
     * @param name name for new teacher
     * @param salary salary of new teacher
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return  name;
    }
    public int getSalary(){
        return  salary;
    }
   public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the teacher is " + name + " and he earned so far $ " + salaryEarned;
    }
}
