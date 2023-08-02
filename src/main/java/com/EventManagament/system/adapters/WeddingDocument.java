package com.EventManagament.system.adapters;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.Map;

@Data
@Document
public class WeddingDocument {
    @Id
    private ObjectId id;

    private BigInteger idWedding;
    private Integer dniNumberHusband;
    private Integer dniNumberWife;
    private String nameHusband;
    private String nameWife;
    private Boolean available;
    private Map<Integer,String> listGuest;
    //TODO: DATE WEDDING
}
