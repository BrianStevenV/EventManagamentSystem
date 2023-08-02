package com.EventManagament.system.domain.usecase;

import com.EventManagament.system.domain.models.AvailableWedding;
import com.EventManagament.system.domain.spi.IWeddingPersistencePort;
import com.EventManagament.system.domain.api.IWeddingServicePort;
import com.EventManagament.system.domain.models.Wedding;


public class WeddingUseCase implements IWeddingServicePort {
    private final IWeddingPersistencePort weddingPersistencePort;

    public WeddingUseCase(IWeddingPersistencePort weddingPersistencePort) {
        this.weddingPersistencePort = weddingPersistencePort;
    }

    @Override
    public void createWedding(Wedding wedding) {
        weddingPersistencePort.createWedding(wedding);
    }

    @Override
    public void availableWedding(AvailableWedding availableWedding) {
        weddingPersistencePort.updateAvailableStatus(availableWedding);
    }
}
