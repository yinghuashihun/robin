package com.dtdream.vanyar.robin.agent;

import com.dtdream.vanyar.robin.Span;
import com.dtdream.vanyar.robin.dubbomonitor.HydraService;

import java.util.List;

/**
 * User: yfliuyu
 * Date: 13-4-7
 * Time: 下午3:22
 */
public class TestHydraService implements HydraService{
    @Override
    public boolean push(List<Span> span) {
        System.out.println("span size:"+span.size());
        return false;
    }
}
