package com.EventManagament.system.domain.spi;

import com.EventManagament.system.domain.models.Wedding;

import java.util.Map;

public interface IWeddingPersistencePort {
    void createWedding(Wedding wedding);
}
