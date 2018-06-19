package com.models.payload.response;

import com.models.Models.Price;
import lombok.AllArgsConstructor;
import lombok.Getter;


import java.time.LocalDate;

@Getter @AllArgsConstructor
public class PriceResponse {
    private float price;
    private LocalDate desde;
    private LocalDate hasta;
    private RouteResponse route;
    private CabinResponse cabin;
    public PriceResponse(Price price){
        this.price = price.getPrice();
        this.desde = price.getDesde();
        this.hasta = price.getHasta();
        this.route = new RouteResponse(price.getCabin_Route().getRoute());
        this.cabin = new CabinResponse(price.getCabin_Route().getCabin());
    }
}
