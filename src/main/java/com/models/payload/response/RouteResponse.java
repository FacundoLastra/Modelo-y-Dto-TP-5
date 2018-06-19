package com.models.payload.response;


import com.models.Models.Route;
import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter @AllArgsConstructor
public class RouteResponse{
    private AirportResponse airportOrigin;
    private AirportResponse airportDestination;
    private float distance;
    //private List<CabinResponse> cabins;

    public RouteResponse(Route route){
        this.distance = route.getDistance();
        this.airportOrigin = new AirportResponse(route.getOrigin());
        this.airportDestination = new AirportResponse(route.getDestination());
    }
}
