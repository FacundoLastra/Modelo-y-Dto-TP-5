package com.models.Models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "city")
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode
public class City {
    public City (String iata, String name, State state){
        this.iata = iata;
        this.name = name;
        this.stateAtribute = state;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    @Size(max = 3)
    @Column(unique = true) //Not is Unique
    private String iata;

    private String name;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State stateAtribute;

}
