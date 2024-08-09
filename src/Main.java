public class Main {
    public static Employee employee(String name, int department, int salary) {
        return new Employee(name, department, salary);
    }

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = employee("Jeffrey Warren", 1, 88655);
        employees[1] = employee("William Simpso", 2, 77594);
        employees[2] = employee("Hector Marshall", 3, 104520);
        employees[3] = employee("James Hall", 4, 70050);
        employees[4] = employee("John Phillips", 5, 152689);
        employees[5] = employee("Richard Rodgers", 1, 75436);
        employees[6] = employee("Richard Davis", 2, 73500);
        employees[7] = employee("Oscar Castillo", 3, 78970);
        employees[8] = employee("Jason Jones", 4, 102400);
        employees[9] = employee("Robert Miles", 5, 146530);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println(" ");
        int total = allSalary();
        System.out.println(" Общая сумма зарплат " + total);
        System.out.println(" ");
        Employee minSalary = findMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalary);
        System.out.println(" ");
        Employee maxSalary = findMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalary);
        System.out.println(" ");
        double averageSalary = averageSalary();
        System.out.println("Средняя зарплата");
        System.out.println(" ");
        printEmployeeFullNames();
    }

    public static int allSalary() {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

    public static Employee findMinSalary() {
        if (employees.length == 0) return null;
        Employee minSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary.getSalary()) minSalary = employees[i];

        }
        return minSalary;
    }

    public static Employee findMaxSalary() {
        if (employees.length == 0) return null;
        Employee maxSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary.getSalary()) maxSalary = employees[i];

        }
        return maxSalary;
    }

    public static double averageSalary() {
        if (employees.length == 0) return 0;
        return allSalary (employees) / employees.length;
    }

    public static void printEmployeeFullNames() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }
}
