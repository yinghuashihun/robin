package com.dtdream.vanyar.robin.dubbo;

import com.dtdream.vanyar.robin.agent.Tracer;
import org.junit.Test;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

/**
 * User: xiangkui
 * Date: 13-4-7
 * Time: 下午6:26
 */
public class TestHydraTracer extends AbstractDependencyInjectionSpringContextTests {
    Tracer tracer = Tracer.getTracer();

//    @Override
//    protected String[] getConfigLocations() {
//        String[] location = {
//                "classpath:/dubbo-demo-App.xml"
//        };
//        return location;
//    }
//
//    public void testTracerInstance() throws Exception {
//    }
}
