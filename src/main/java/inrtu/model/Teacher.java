package inrtu.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author kolosov.slava
 */
@Data
@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String surname;
    private String firstName;
    private String patronymic;
    @OneToMany
    @JoinColumn(name = "pair_id", unique = false, nullable = false)
    private Collection<Pair>pairs;
}
