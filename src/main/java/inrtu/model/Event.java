package inrtu.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dt;
    private int pairNumber;
    private String description;
    private Long eventTypeId;
    private Long[] relatedQueries;
    private Long pairId;
}
