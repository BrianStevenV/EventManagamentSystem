package com.EventManagament.system.adapters.driven;

import com.EventManagament.system.adapters.WeddingDocument;
import com.EventManagament.system.domain.models.AvailableWedding;
import com.EventManagament.system.domain.spi.IWeddingPersistencePort;
import com.EventManagament.system.domain.models.Wedding;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

@RequiredArgsConstructor
public class WeddingMongodbAdapter implements IWeddingPersistencePort {
    private final IWeddingDocumentMapper weddingDocumentMapper;
    private final MongoTemplate mongoTemplate;
    @Override
    public void createWedding(Wedding wedding) {
         WeddingDocument weddingDocument = weddingDocumentMapper.toWeddingDocument(wedding);
         mongoTemplate.insert(weddingDocument, "wedding");
    }

    @Override
    public Wedding findWedding(AvailableWedding availableWedding) {
        Query query = new Query(Criteria.where("_id").is(availableWedding.getIdWedding()));
        WeddingDocument weddingDocument = mongoTemplate.findOne(query, WeddingDocument.class);

        return weddingDocumentMapper.toWedding(weddingDocument);

        //TODO: STRICT ARCHITECTURE.
    }

    @Override
    public void saveWedding(Wedding wedding) {
        mongoTemplate.save(weddingDocumentMapper.toWeddingDocument(wedding));
    }

    @Override
    public void updateAvailableStatus(AvailableWedding availableWedding) {
        Query query = new Query(Criteria.where("_id").is(availableWedding.getIdWedding()));
        Update update = new Update().set("available", availableWedding.getAvailable());

        mongoTemplate.updateFirst(query, update, WeddingDocument.class);
    }

    //TODO: MORE METHODS TO CREATE FLEXIBILITY LATER.

}
