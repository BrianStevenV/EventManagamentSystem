package com.EventManagament.system.adapters.driving.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigInteger;
@AllArgsConstructor
@Getter
public class AvailableWeddingRequestDto {
    private BigInteger idWedding;
    private Boolean available;
}
