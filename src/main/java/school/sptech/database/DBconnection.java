package school.sptech.database;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
public class DBconnection {
    private JdbcTemplate connection;
    public DBconnection() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:h2:file:./banco");
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUsername("sa");
        dataSource.setPassword("");

        this.connection = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConexaoDoBanco() {
        return connection;
    }
}
