package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class DBConnectionUtilTest {

    @Test
    public void connection() {
        //given
        Connection connection = DBConnectionUtil.getConnection();

        //when

        //then
        assertThat(connection).isNotNull();

    }
}
