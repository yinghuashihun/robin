package com.dtdream.vanyar.robin.wrapper;

import com.alibaba.dubbo.rpc.protocol.ProtocolListenerWrapper;
import com.dtdream.vanyar.robin.Span;
import com.dtdream.vanyar.robin.agent.Tracer;

/**
 * Date: 13-5-29
 * Time: 上午9:50
 */
public class TraceRunnable implements Runnable{
    private final Span parent;
    private final Runnable runnable;
    private Tracer tracer = Tracer.getTracer();


    public TraceRunnable(Runnable r){
        this.parent = tracer.getParentSpan();
        this.runnable = r;
    }

    public TraceRunnable(Runnable r, Span p){
        this.runnable = r;
        this.parent = p;
        ProtocolListenerWrapper listr = null;
    }
    @Override
    public void run() {
        if(parent != null){
            tracer.setParentSpan(parent);
        }
        runnable.run();
    }
}
