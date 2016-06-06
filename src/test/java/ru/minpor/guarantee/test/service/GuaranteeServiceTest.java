package ru.minpor.guarantee.test.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import ru.minpor.guarantee.service.GuaranteeService;
import ru.minpor.guarantee.test.config.TestDataBaseConfig;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;


@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataBaseConfig.class)
@WebAppConfiguration
public class GuaranteeServiceTest {

    @Resource
    private GuaranteeService guaranteeService;


    @Test
    public void testSaveGuarantee() throws Exception {

        guaranteeService.truncate();
        guaranteeService.addGuarantee();
        String guaranteeTest = guaranteeService.getByName("0470111300000114000504").getDocNumber();
        assertEquals("0470111300000114000504", guaranteeTest);
    }


}
