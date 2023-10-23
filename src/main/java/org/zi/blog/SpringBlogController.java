package org.zi.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/request")
public class SpringBlogController {
    @GetMapping("/{requestedWord}")
    public ResponseEntity<String> findWord(@PathVariable Word requestedWord) {
        return ResponseEntity.ok(requestedWord.wordContent());
    }

}
