package org.zi.blog;

import jakarta.persistence.*;
import org.zi.blog.word.Word;

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