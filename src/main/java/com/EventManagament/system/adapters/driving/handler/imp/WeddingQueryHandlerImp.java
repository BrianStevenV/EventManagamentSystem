package com.EventManagament.system.adapters.driving.handler.imp;

import com.EventManagament.system.adapters.driving.dto.response.WeddingResponseDto;
import com.EventManagament.system.adapters.driving.handler.IWeddingQueryHandler;
import com.EventManagament.system.domain.api.IWeddingServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeddingQueryHandlerImp implements IWeddingQueryHandler {
    private final IWeddingServicePort weddingServicePort;
    @Override
    public WeddingResponseDto getWedding(int id) {
        return weddingServicePort.getWedding(id);
    }
}
