package com.EventManagament.system.configuration;

import com.EventManagament.system.adapters.driven.IWeddingDocumentMapper;
import com.EventManagament.system.adapters.driven.WeddingMongodbAdapter;
import com.EventManagament.system.domain.spi.IWeddingPersistencePort;
import com.EventManagament.system.domain.api.IWeddingServicePort;
import com.EventManagament.system.domain.usecase.WeddingUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IWeddingDocumentMapper weddingDocumentMapper;
    private MongoTemplate mongoTemplate;

    @Bean
    public IWeddingServicePort weddingServicePort(){
        return new WeddingUseCase(weddingPersistencePort());
    }

    @Bean
    public IWeddingPersistencePort weddingPersistencePort(){
        return new WeddingMongodbAdapter(weddingDocumentMapper, mongoTemplate);
    }
}
