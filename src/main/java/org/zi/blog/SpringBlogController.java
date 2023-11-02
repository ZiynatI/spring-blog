package org.zi.blog;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.zi.blog.word.Word;
import org.zi.blog.word.WordStatus;


@Controller
@RequestMapping("/request")
public class SpringBlogController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping(value = "/{requestedWord}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Word> findWord(@PathVariable String requestedWord) throws Exception {
        Integer result = this.jdbcTemplate.queryForObject("SELECT 12345", Integer.class);
        System.out.println("=== " + result);
        return ResponseEntity.ok(new Word(requestedWord, WordStatus.NEW_WORD));
    }

    @PostMapping("/{requestedWord}")
    private ResponseEntity<String> createCashCard() {
        return ResponseEntity.ok("Hello World!");
    }

}
