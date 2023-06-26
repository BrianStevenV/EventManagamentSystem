package com.EventManagament.system.adapters.driving.mapper;

import com.EventManagament.system.adapters.driving.WeddingRequestDto;
import com.EventManagament.system.domain.models.Wedding;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IWeddingRequestMapper {
    Wedding toWedding(WeddingRequestDto weddingRequestDto);
}
