package com.EventManagament.system.adapters.driving.handler;


import com.EventManagament.system.adapters.driving.WeddingRequestDto;
import com.EventManagament.system.adapters.driving.dto.request.AvailableWeddingRequestDto;


public interface IWeddingMutationHandler {
    void createWedding(WeddingRequestDto weddingRequestDto);
    void availableWedding(AvailableWeddingRequestDto availableWeddingRequest);
}
