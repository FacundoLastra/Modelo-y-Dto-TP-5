package com.models.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter @Setter
public class StateRequest {

    @NotNull
    String iata_code;
    @NotNull
    String name;
    @NotNull
    String countryCode;

}
