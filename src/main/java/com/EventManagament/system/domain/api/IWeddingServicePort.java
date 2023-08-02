package com.EventManagament.system.domain.api;


import com.EventManagament.system.domain.models.AvailableWedding;
import com.EventManagament.system.domain.models.Wedding;


public interface IWeddingServicePort {
    void createWedding(Wedding wedding);
    void availableWedding(AvailableWedding availableWedding);
}
