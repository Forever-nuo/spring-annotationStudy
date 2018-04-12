package tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 16:54
 */
@Service
public class TxService {

    @Qualifier("jdbcTemplate")
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Transactional(rollbackFor = RuntimeException.class)
    public void insertPerson(){
        String sql = "insert into person (name) VALUES ('斩杀1')";
        jdbcTemplate.execute(sql);
        int i = 10/0;
    }
}
