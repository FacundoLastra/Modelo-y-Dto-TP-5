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
@Table(name = "airports")
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode
public class Airports {

    public Airports (String iata, String name, City city, float longitud, float latitud) {

        this.iata = iata;
        this.name = name;
        this.city = city;
        this.longitud = longitud;
        this.latitud = latitud;
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
    @JoinColumn(name = "city_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private City city;

    private float longitud;
    private float latitud;

}
