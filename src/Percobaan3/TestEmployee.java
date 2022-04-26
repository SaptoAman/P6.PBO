package Percobaan3;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employeeA = new Employee();
        employeeA.displayInfo();

        System.out.println();

        Employee employeeB = new Employee("Butet", "Sitorus", "System Analyst");
        employeeB.displayInfo();
        employeeB.displayDefault();
    }
}
