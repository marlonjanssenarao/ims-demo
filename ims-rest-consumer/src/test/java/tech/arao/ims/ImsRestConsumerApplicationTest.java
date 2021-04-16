package tech.arao.ims;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ImsRestConsumerApplicationTest {

    @Autowired
    private RestTemplate template;


    @Test
    public void loadContexts() {
        assertThat(template).isNotNull();
    }
}
