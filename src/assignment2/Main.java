package assignment2;
import  java.lang.String;
public class Main {
        public static void main(String[] args) {
            Student hocsinh1 = new Student("ka312345","nam",20);
            Student hocsinh2 = new Student("ka213232","dat",19);

            PersonModel lists1 = new PersonModel();
            lists1.addStudent(hocsinh1);
            lists1.addStudent(hocsinh2);
            lists1.showStudent();

            Employee nhanvien1 = new Employee("ka2323","lan",2500.01);
            Employee nhanvien2 = new Employee("ka3239","Truong",3000.0);


            PersonModel lists2 = new PersonModel();
            lists2.addEmployee(nhanvien1);
            lists2.addEmployee(nhanvien2);
            lists2.showEmployee();
        }
    }
