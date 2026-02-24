package com.api.courses.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "article")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String article;
    private int quantite;
    private Double prix;
}
