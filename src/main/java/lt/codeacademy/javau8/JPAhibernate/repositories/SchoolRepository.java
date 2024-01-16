package lt.codeacademy.javau8.JPAhibernate.repositories;

import lt.codeacademy.javau8.JPAhibernate.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
}
