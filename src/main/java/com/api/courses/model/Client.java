package com.api.courses.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "client")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String matricule;
    private String nom;
    private String prenom;
    private Data dateNaissance;
}
