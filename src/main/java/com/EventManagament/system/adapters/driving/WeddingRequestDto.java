package com.EventManagament.system.adapters.driving;


import lombok.Data;

import java.util.Map;
@Data
public class WeddingRequestDto {
    private Integer dniNumberHusband;
    private Integer dniNumberWife;
    private String nameHusband;
    private String nameWife;
    private Map<Integer,String> listGuest;
}
