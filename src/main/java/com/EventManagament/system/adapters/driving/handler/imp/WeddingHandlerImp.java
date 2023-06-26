package com.EventManagament.system.adapters.driving.handler.imp;

import com.EventManagament.system.adapters.driving.WeddingRequestDto;
import com.EventManagament.system.adapters.driving.handler.IWeddingHandler;
import com.EventManagament.system.adapters.driving.mapper.IWeddingRequestMapper;
import com.EventManagament.system.domain.IWeddingServicePort;
import lombok.RequiredArgsConstructor;

import java.util.Map;
@RequiredArgsConstructor
public class WeddingHandlerImp implements IWeddingHandler {
    private final IWeddingServicePort weddingServicePort;
    private final IWeddingRequestMapper weddingRequestMapper;

    @Override
    public void createWedding(WeddingRequestDto weddingRequestDto) {
        weddingServicePort.createWedding(weddingRequestMapper.toWedding(weddingRequestDto));
    }
}
