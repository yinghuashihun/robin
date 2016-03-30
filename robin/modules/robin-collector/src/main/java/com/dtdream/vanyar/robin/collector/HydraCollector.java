package com.dtdream.vanyar.robin.collector;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * User: xiangkui
 * Date: 13-5-22
 * Time: 下午5:04
 */
@SpringBootApplication
public class HydraCollector {
    public static void main1(String[] strings) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "classpath*:dubbo-hydra-provider.xml"
        });
        context.start();
        while (true) {
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}