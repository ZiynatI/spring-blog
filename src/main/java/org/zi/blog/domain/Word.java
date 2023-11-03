package org.zi.blog.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "word")
public class Word {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "wordContent")
    String wordContent;
    @Column(name = "wordStatus")
    WordStatus wordStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    public Word(String wordContent, WordStatus wordStatus, User user) {
        this.wordContent = wordContent;
        this.wordStatus = wordStatus;
        this.user = user;
    }

    public Word(String wordContent, WordStatus wordStatus) {
        this.wordContent = wordContent;
        this.wordStatus = wordStatus;
    }
}
