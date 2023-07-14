package com.EventManagament.system.adapters.driving.handler;

import com.EventManagament.system.adapters.driving.dto.response.WeddingResponseDto;

public interface IWeddingQueryHandler {
    WeddingResponseDto getWedding(final int id);
}
