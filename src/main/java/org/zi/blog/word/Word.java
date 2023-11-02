package org.zi.blog.word;

import org.zi.blog.word.WordStatus;

public record Word(String wordContent, WordStatus wordStatus) {

    public Word(String wordContent, WordStatus wordStatus) {
        this.wordContent = wordContent;
        this.wordStatus = wordStatus;
    }
}
