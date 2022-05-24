package inrtu.repository;

import inrtu.model.Discipline;
import inrtu.model.EducationGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationGroupRepository extends JpaRepository<EducationGroup, Long> {
}
