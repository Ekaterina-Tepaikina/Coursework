import java.util.Arrays;

public class Main {
    public static int countTotalSalary (Employee[] employees){
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
    public static Employee findMinSal (Employee[] employees) {
        int minSal = employees[0].getSalary();
        byte n = 0;
        for (byte i = 0; i < employees.length; i++)
            if (minSal>employees[i].getSalary()) {
                minSal = employees[i].getSalary();
                n = i;
            }
        return employees[n];
    }

    public static Employee findMaxSal (Employee[] employees) {
        int maxSal = employees[0].getSalary();
        byte n = 0;
        for (byte i = 0; i < employees.length; i++)
            if (maxSal<employees[i].getSalary()) {
                maxSal = employees[i].getSalary();
                n = i;
            }
        return employees[n];
    }

    public static int countAverageSalary (Employee[] employees) {
        int totalSalary = 0;
        byte s = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            s++;
        }
        return totalSalary/s;
    }

    public static void FIO (Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFIO());
        }
    }

    private static final Employee[] employees = new Employee [10];

    public static void main(String[] args) {
        Employee.count = 1;
        employees[0] = new Employee("Ivanov Ivan Ivanovich", 1, 35_000);
        employees[1] = new Employee("Huxley Oldos Johny", 2, 115_000);
        employees[2] = new Employee("Roth Veronica Alexandrovna", 5, 110_000);
        employees[3] = new Employee("Petrov Petr Petrovich", 4, 48_600);
        employees[4] = new Employee("Alexandrov Alexandr Alexandrovich", 5, 120_400);
        employees[5] = new Employee("Tolstikh Nikita Jonovich", 3, 80_234);
        employees[6] = new Employee("Tolstoy Alexandr Germanovich", 2, 98_900);
        employees[7] = new Employee("Tepaykina Ekaterina Andreevna", 5, 135_700);
        employees[8] = new Employee("Vasilchuck Kseniya Vladimirovna", 4, 115_600);
        employees[9] = new Employee("Stadnikova Ol'ga Alekseevna", 1, 110_111);
        System.out.println(Arrays.toString(employees));
        employees[4].setSalary(122_400);
        System.out.println(employees[4]);
        System.out.println(countTotalSalary(employees));
        System.out.println(findMinSal(employees));
        System.out.println(findMaxSal(employees));
        System.out.println(countAverageSalary(employees));
        FIO(employees);
    }
}