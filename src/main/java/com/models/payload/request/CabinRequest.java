package com.models.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter @Setter
public class CabinRequest {

    @NotNull
    int routeId;
    @NotNull
    String name;
    int id;
}
