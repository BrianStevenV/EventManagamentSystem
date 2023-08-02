package com.EventManagament.system.adapters.driven;

import com.EventManagament.system.adapters.WeddingDocument;
import com.EventManagament.system.domain.models.Wedding;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IWeddingDocumentMapper {

    WeddingDocument toWeddingDocument(Wedding wedding);
    Wedding toWedding(WeddingDocument weddingDocument);
}
