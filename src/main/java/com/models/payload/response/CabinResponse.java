package com.models.payload.response;

import com.models.Models.Cabin;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class CabinResponse {
    //private int id;
    private String name;
    //private List<PriceResponse> priceList;
    public CabinResponse(Cabin cabin){
        this.name = cabin.getName();
    }
}
