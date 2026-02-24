package com.api.courses.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Commande")
@Getter
@Setter
@Builder
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdCommande;
    private String IdClient;
    private List<Article> article;
    private String commentaire;
}
