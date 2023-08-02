package com.EventManagament.system.adapters.driving.handler.imp;

import com.EventManagament.system.adapters.driving.WeddingRequestDto;
import com.EventManagament.system.adapters.driving.dto.request.AvailableWeddingRequestDto;
import com.EventManagament.system.adapters.driving.handler.IWeddingMutationHandler;
import com.EventManagament.system.adapters.driving.mapper.IAvailableRequestMapper;
import com.EventManagament.system.adapters.driving.mapper.IWeddingRequestMapper;
import com.EventManagament.system.domain.api.IWeddingServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeddingMutationHandlerImp implements IWeddingMutationHandler {
    private final IWeddingServicePort weddingServicePort;
    private final IWeddingRequestMapper weddingRequestMapper;
    private final IAvailableRequestMapper availableRequestMapper;

    @Override
    public void createWedding(WeddingRequestDto weddingRequestDto) {
        weddingServicePort.createWedding(weddingRequestMapper.toWedding(weddingRequestDto));
    }

    @Override
    public void availableWedding(AvailableWeddingRequestDto availableWeddingRequest) {
        weddingServicePort.availableWedding(availableRequestMapper.toAvailableWedding(availableWeddingRequest));
    }
}
