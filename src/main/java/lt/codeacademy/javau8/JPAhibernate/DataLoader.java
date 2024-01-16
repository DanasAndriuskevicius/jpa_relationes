package lt.codeacademy.javau8.JPAhibernate;

import lt.codeacademy.javau8.JPAhibernate.entities.Department;
import lt.codeacademy.javau8.JPAhibernate.entities.Employee;
import lt.codeacademy.javau8.JPAhibernate.entities.School;
import lt.codeacademy.javau8.JPAhibernate.entities.Student;
import lt.codeacademy.javau8.JPAhibernate.repositories.DepartmentRepository;
import lt.codeacademy.javau8.JPAhibernate.repositories.EmployeeRepository;
import lt.codeacademy.javau8.JPAhibernate.repositories.SchoolRepository;
import lt.codeacademy.javau8.JPAhibernate.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    StudentRepository str;
    @Autowired
    SchoolRepository scr;

    @Override
    public void run(String... args) throws Exception {

        School school = new School();

        Student andrius = new Student("Andrius");
        Student arvydas = new Student("Arvydas");
        Student voldemaras = new Student("Voldemaras");


        str.saveAll(Arrays.asList(andrius, arvydas, voldemaras));

        school.setName("Atzalyno vid.");

        school.addStudent(andrius);
        school.addStudent(arvydas);
        school.addStudent(voldemaras);
        scr.save(school);

    }
}
