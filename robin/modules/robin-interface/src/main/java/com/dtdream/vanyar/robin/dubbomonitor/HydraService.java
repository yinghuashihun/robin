package com.dtdream.vanyar.robin.dubbomonitor;


import com.dtdream.vanyar.robin.Span;

import java.io.IOException;
import java.util.List;

public interface HydraService {
    boolean push(List<Span> span) throws IOException;
}