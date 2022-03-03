package com.gpstracker.gpstracker.controllers;

import com.gpstracker.gpstracker.model.Position;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class PositionItemDto {
    private Double latitude;
    private Double longitude;
    private LocalDateTime datetime;
    private UUID deviceCode;
    private String link;

    public PositionItemDto(Position p) {
        this.latitude = p.getLatitude();
        this.longitude = p.getLongitude();
        this.datetime = p.getDatetime();
        this.deviceCode = p.getDeviceCode();
        this.link = "https://www.google.com.br/maps/place/" + latitude + "," + longitude;
    }
}
