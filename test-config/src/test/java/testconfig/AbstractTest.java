package testconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import testconfig.service.TestService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class AbstractTest {

    /*@Test
    public void test()
    {

    }*/

    @Configuration
    static class InnerConfiguration {

        @Bean
        TestService getTestService() {
            return new TestService();
        }
    }
}
