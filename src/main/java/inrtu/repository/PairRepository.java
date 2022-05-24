package inrtu.repository;

import inrtu.model.Discipline;
import inrtu.model.Pair;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PairRepository extends JpaRepository<Pair, Long> {
}
