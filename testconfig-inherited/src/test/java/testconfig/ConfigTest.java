package testconfig;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import testconfig.service.ProductionService;
import testconfig.service.TestService;

public class ConfigTest extends BaseTestClass {

    @Autowired
    private ProductionService service;

    @Autowired
    private TestService testService;

    @Test
    public void test() {
        assertNotNull(service);
        assertNotNull(testService);
    }

}
