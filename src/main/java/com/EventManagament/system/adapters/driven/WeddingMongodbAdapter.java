package com.EventManagament.system.adapters.driven;

import com.EventManagament.system.adapters.WeddingDocument;
import com.EventManagament.system.domain.spi.IWeddingPersistencePort;
import com.EventManagament.system.domain.models.Wedding;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;

@RequiredArgsConstructor
public class WeddingMongodbAdapter implements IWeddingPersistencePort {
    private final IWeddingDocumentMapper weddingDocumentMapper;
    private final MongoTemplate mongoTemplate;
    @Override
    public void createWedding(Wedding wedding) {
         WeddingDocument weddingDocument = weddingDocumentMapper.toWeddingDocument(wedding);
         mongoTemplate.insert(weddingDocument, "wedding");
    }
}
