package org.zi.blog;

import org.springframework.jdbc.core.RowMapper;
import org.zi.blog.word.Word;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WordRowMapper implements RowMapper<Word> {

    @Override
    public Word mapRow(ResultSet rs, int rowNum) throws SQLException {
        return null;
    }
}
