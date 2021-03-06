package com.models.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter @Setter
public class RouteRequest {

    @NotNull
    String iataAirportOrigin;
    @NotNull
    String iataAirportDestination;
    @NotNull
    float distance;
    int id;
}
