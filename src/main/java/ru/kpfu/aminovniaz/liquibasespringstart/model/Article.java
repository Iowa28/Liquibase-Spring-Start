package ru.kpfu.aminovniaz.liquibasespringstart.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String text;

    @ManyToOne
    private Author author;
}
