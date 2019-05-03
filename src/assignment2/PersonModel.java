package assignment2;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonModel {
    public ArrayList<Student> arrListStudent = new ArrayList<>();
    public ArrayList<Employee> arrListEmployee = new ArrayList<>();

    public void addStudent(Student person) {
        if (person instanceof Student) {
            arrListStudent.add(person);
        }
    }

    public void showStudent() {
        for (Student obj : arrListStudent) {
            if (obj instanceof Student) {
                System.out.println(obj.toString());
            }
        }
    }
    public void addEmployee(Employee person) {
        if (person instanceof Employee) {
            arrListEmployee.add(person);
        }
    }

    public void showEmployee() {
        for (Employee obj : arrListEmployee) {
            if (obj instanceof Employee) {
                System.out.println(obj.toString());
            }
        }
    }
}