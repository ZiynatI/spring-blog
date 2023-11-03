package org.zi.blog.word;

import jakarta.persistence.*;
import org.zi.blog.User;
import org.zi.blog.word.WordStatus;

@Entity
@Table(name = "word")
public class Word {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String wordContent;
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
