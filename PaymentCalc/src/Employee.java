public class Employee {

    private String namme;
    private String surname;
    double salary;

    public Employee(String namme, String surname, double salary) {
        this.namme = namme;
        this.surname = surname;
        this.salary = salary;
    }

    public String getNamme() {
        return namme;
    }

    public void setNamme(String namme) {
        this.namme = namme;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
