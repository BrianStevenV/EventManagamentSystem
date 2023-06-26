package com.EventManagament.system.adapters.driven;

import com.EventManagament.system.domain.IWeddingPersistencePort;
import com.EventManagament.system.domain.models.Wedding;
import lombok.RequiredArgsConstructor;

import java.util.Map;
@RequiredArgsConstructor
public class WeddingMongodbAdapter implements IWeddingPersistencePort {
    @Override
    public Wedding createWedding(Integer dhiNumberHusband, Integer dniNumberWife, String nameHusband, String nameWife, Map<Integer, String> listGuest) {
        return null;
    }
}
