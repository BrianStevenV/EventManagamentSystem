package com.EventManagament.system.domain;

import com.EventManagament.system.domain.models.Wedding;

import java.util.Map;

public interface IWeddingPersistencePort {
    Wedding createWedding(Integer dhiNumberHusband, Integer dniNumberWife, String nameHusband, String nameWife, Map<Integer, String> listGuest);
}
