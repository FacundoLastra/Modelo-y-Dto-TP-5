package com.models.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter @Setter
public class PriceRequest {

    @NotNull
    int idCabin;
    @NotNull
    int idRoute;
    @NotNull
    float price;
    @NotNull
    String desde;
    @NotNull
    String hasta;
    int id;


}
