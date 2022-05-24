package inrtu.repository;

import inrtu.model.Discipline;
import inrtu.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
