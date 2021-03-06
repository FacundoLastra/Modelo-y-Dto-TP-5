package com.models.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="country",
        uniqueConstraints = {@UniqueConstraint(columnNames={"code"})})
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode
public class Country {

    public Country(String name, String code){

        this.name = name;
        this.code = code;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",updatable = false,nullable = false)
    private long id;
    String name;
    String code;

    @OneToMany(mappedBy="nation",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties("nation")
    private List<State> stateList;

}
