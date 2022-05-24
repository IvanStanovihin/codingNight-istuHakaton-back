package inrtu.repository;

import inrtu.model.Discipline;
import inrtu.model.Institute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstituteRepository extends JpaRepository<Institute, Long> {
}
