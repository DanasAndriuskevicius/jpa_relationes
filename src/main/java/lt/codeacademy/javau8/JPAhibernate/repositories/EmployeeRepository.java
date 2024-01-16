package lt.codeacademy.javau8.JPAhibernate.repositories;

import lt.codeacademy.javau8.JPAhibernate.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
