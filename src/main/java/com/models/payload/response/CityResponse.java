package com.models.payload.response;

import com.models.Models.City;
import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter @AllArgsConstructor
public class CityResponse {
    private String iata;
    private String name;
    private StateResponse state;

    public CityResponse(City city){
        this.iata = city.getIata();
        this.name = city.getName();
        this.state = new StateResponse(city.getStateAtribute());
    }
}
