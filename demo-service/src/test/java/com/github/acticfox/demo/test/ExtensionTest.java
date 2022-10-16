package com.github.acticfox.demo.test;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.acticfox.common.api.result.ResultDTO;
import com.github.acticfox.demo.api.DemoService;

/**
 * ExtensionTest
 *
 * @author fanyong.kfy
 * @date 2020-11-14 2:55 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ExtensionTest {

    @Resource
    private DemoService demoService;

    @Test
    public void testF() {
        ResultDTO result = demoService.submitTenderApply(1L, "F");
        Assert.assertTrue(result.isSuccess());
    }

    @Test
    public void testA() {
        ResultDTO result = demoService.submitTenderApply(2L, "A");
        Assert.assertTrue(result.isSuccess());
    }

    @Test
    public void testB() {
        ResultDTO result = demoService.submitTenderApply(3L, "B");
        Assert.assertTrue(result.isSuccess());
    }

    @Test
    public void testC() {
        ResultDTO result = demoService.submitTenderApply(4L, "C");
        Assert.assertTrue(result.isSuccess());
    }

    @Test
    public void testD() {
        ResultDTO result = demoService.submitTenderApply(1L, "D");
        Assert.assertTrue(result.isSuccess());
    }

}
