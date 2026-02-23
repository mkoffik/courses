package com.api.courses.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Commande {
    private String IdCommande;
    private String IdClient;
    private List<Article> article;
    private String commentaire;
}
