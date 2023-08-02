package com.EventManagament.system.adapters.driving.mapper;

import com.EventManagament.system.adapters.driving.dto.request.AvailableWeddingRequestDto;
import com.EventManagament.system.domain.models.AvailableWedding;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IAvailableRequestMapper {
    AvailableWedding toAvailableWedding(AvailableWeddingRequestDto availableWeddingRequestDto);
}
