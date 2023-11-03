package org.zi.blog.domain;

import jakarta.persistence.*;
import org.zi.blog.domain.Word;

import java.util.List;
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Word> words;

}