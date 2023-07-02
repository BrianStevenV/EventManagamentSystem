package com.EventManagament.system.domain.usecase;

import com.EventManagament.system.domain.IWeddingPersistencePort;
import com.EventManagament.system.domain.IWeddingServicePort;
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
}
