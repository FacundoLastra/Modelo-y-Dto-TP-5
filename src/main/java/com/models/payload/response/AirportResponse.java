package com.models.payload.response;


import com.models.Models.Airports;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class AirportResponse {
    private String iata;
    private String name;
    private  CityResponse city;
    private float latitud;
    private float longitud;
    public AirportResponse(Airports airport){
        this.iata = airport.getIata();
        this.name = airport.getName();
        this.city = new CityResponse(airport.getCity());
        this.latitud = airport.getLatitud();
        this.longitud = airport.getLongitud();
    }

}
