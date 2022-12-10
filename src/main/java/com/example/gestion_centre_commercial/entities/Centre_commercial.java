package com.example.gestion_centre_commercial.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table( name = "Centre_commercial")
public class Centre_commercial implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    String adresse ;
    String login ;
    String password ;

    @OneToMany(mappedBy = "centre_commercial",cascade =CascadeType.ALL )
    Set<Boutique>boutiques=new HashSet<>();

}
