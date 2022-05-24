package inrtu.repository;

import inrtu.model.Discipline;
import inrtu.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
