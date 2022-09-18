package course;

import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        Employee emp = new Employee("Иван", "Иванович", "Иванов", 3, 21000);
        Employee emp1 = new Employee("Пётр", "Сергеевич", "Клабуков", 1, 19000);
        Employee emp2 = new Employee("Василий", "Сергеевич", "Мутко", 1, 25000);
        Employee emp3 = new Employee("Денис", "Владимирович", "Зуборев", 4, 29789);
        Employee emp4 = new Employee("Софья", "Констатиновна", "Мутко", 1, 69000);
        Employee emp5 = new Employee("Анна", "Алексеевна", "Ницше", 3, 45000);
        Employee emp6 = new Employee("Александр", "Алексеевич", "Притуляк", 2, 37765);
        Employee emp7 = new Employee("Александр", "Петрович", "Шолгин", 1, 11000);
        Employee emp8 = new Employee("Артур", "Захарович", "Липатов", 4, 17000);
        Employee emp9 = new Employee("Альберт", "Александрович", "Грабурдо", 1, 50123);

        employees[0] = emp;
        employees[1] = emp1;
        employees[2] = emp2;
        employees[3] = emp3;
        employees[4] = emp4;
        employees[5] = emp5;
        employees[6] = emp6;
        employees[7] = emp7;
        employees[8] = emp8;
        employees[9] = emp9;

        printEmployees();
        System.out.println(findMinSalary());
        System.out.println(findMaxSalary());
        System.out.println(averageSalary());
        printNameEmployees();


    }

    //сделал методы приватными
    private static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static int printSum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    private static double findMinSalary() {
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    private static double findMaxSalary() {
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    private static double averageSalary() {
        double average = 0;
        for (int i = 0; i < employees.length; i++) {
            average += employees[i].getSalary();
        }
        return average / employees.length ;
    }

    //Добавил метод вывода ФИО
    private static void printNameEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Имя: " + employees[i].getName() + " " + "Отчество:" + " " + employees[i].getMiddleName() + " " + "Фамилия: " + employees[i].getLastName());
        }
    }
}

