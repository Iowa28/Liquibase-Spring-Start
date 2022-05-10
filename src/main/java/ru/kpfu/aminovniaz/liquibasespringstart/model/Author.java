package ru.kpfu.aminovniaz.liquibasespringstart.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstname;
}
