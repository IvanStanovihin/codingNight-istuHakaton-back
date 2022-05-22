package inrtu.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Pair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long typeId;
    private int day;
    private int pairNumber;
    private Long disciplineId;
    private String weekBeginning;
    private int subgroupNumber;

    @ManyToOne
    @JoinColumn(name = "teacher_id", unique = true, nullable = false)
    private Teacher teacher;

}
