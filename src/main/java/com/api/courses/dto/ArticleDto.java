package com.api.courses.dto;

import jakarta.persistence.Entity;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ArticleDto {
    private String code;
    private String article;
    private int quantite;
    private Double prix;
}
