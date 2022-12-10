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
@Table( name = "Boutique")
public class Boutique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    @Enumerated(EnumType.STRING)
    Categorie categorie;
    @ManyToOne
     Centre_commercial centre_commercial;
    @ManyToMany(mappedBy = "boutique")
    Set<Client>clients=new HashSet<>();



}
