package com.models.payload.response;

import com.models.Models.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter @AllArgsConstructor
public class CountryResponse {
    String name;
    String code;

    public CountryResponse(Country country){
        this.name = country.getName();
        this.code = country.getCode();
    }

}
