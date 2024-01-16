package Workers;

public class HRManager extends Employee {

    @Override
    public double getSalary() {
        return salary * 1.75;
    }

    public void addEmployee() {
        System.out.println("Adding an employee...");
    }

}
