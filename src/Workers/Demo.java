package Workers;

public class Demo {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        HRManager manager = new HRManager();
        employee1.work();
        System.out.println(employee1.getSalary());
        manager.work();
        System.out.println(manager.getSalary());
        manager.addEmployee();
    }
}
