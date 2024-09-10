package employeeapp;

public class Employee implements Comparable<Employee>, Cloneable {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int compareTo(Employee e) {
        return this.name.compareTo(e.name);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return name + " " + age + " " + salary;
    }
}
