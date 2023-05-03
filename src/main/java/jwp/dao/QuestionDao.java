package jwp.dao;

import core.jdbc.JdbcTemplate;
import jwp.model.Question;
import jwp.model.User;

import java.sql.SQLException;
import java.util.*;

public class QuestionDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public List<Question> findAll() throws SQLException {
        String sql = "SELECT * FROM QUESTIONS";
        return jdbcTemplate.query(sql,rs -> new Question(rs.getLong("questionId"),
                    rs.getString("writer"),
                    rs.getString("title"),
                    rs.getString("contents"),
                    rs.getDate("createdDate"),
                    rs.getInt("countOfAnswer")));
    }
}
