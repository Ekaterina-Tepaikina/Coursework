public class Employee {
    public static byte count;
    private byte id;
    private String FIO;
    private int department;
    private int salary;

    public Employee(String FIO, int department, int salary) {
        this.id = count;
        this.FIO = FIO;
        this.department = department;
        this.salary = salary;
        count++;
    }

    public byte getId() {
        return id;
    }

    public String getFIO() {
        return FIO;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id: " + this.id + ", ФИО: " + this.FIO + ", отдел: " + department + ", зарплата: " + salary;
    }
}
