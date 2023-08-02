package com.EventManagament.system.domain.spi;

import com.EventManagament.system.domain.models.AvailableWedding;
import com.EventManagament.system.domain.models.Wedding;


public interface IWeddingPersistencePort {
    void createWedding(Wedding wedding);
    Wedding findWedding(AvailableWedding availableWedding);
    void saveWedding(Wedding wedding);
    void updateAvailableStatus(AvailableWedding availableWedding);
}
