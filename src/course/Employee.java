package course;

public class Employee {
    private String name;
    private String middleName;
    private String lastName;

    private int division;
    private double salary;

    //сделал счетчик приватным
    private static int employeeCounter = 0;

    private int id;

    public Employee(String name, String middleName, String lastName, int division, double salary) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.division = division;
        this.salary = salary;
        this.id = employeeCounter++;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDivision() {
        return division;
    }

    public double getSalary() {
        return salary;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " " + "Отчество: " + middleName + " " + "Фамилия: " +lastName + " " + "Подразделение: " + division + " " + "Зарплата: " + salary;
    }
}
