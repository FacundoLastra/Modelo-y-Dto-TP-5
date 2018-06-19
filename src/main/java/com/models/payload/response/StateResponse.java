package com.models.payload.response;

import com.models.Models.State;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class StateResponse {
    String iata;
    String name;
    CountryResponse country;

    public StateResponse(State state){
        this.iata = state.getIata();
        this.name = state.getName();
        this.country = new CountryResponse(state.getNation());
    }
}
