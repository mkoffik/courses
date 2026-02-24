package com.api.courses.model;

import jakarta.persistence.*;
import lombok.*;


import java.util.List;

@Data
@Entity
@Table(name = "Facture")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFacture;
    private String idClient;
    private List<Commande> commande;
    private String commentaire;
}
