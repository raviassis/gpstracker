package com.gpstracker.gpstracker.controllers.api;

import com.gpstracker.gpstracker.model.Position;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
class PositionDto {
    @NotNull
    private Double latitude;
    @NotNull
    private Double longitude;
    @NotNull
    private LocalDateTime datetime;
    @NotNull
    private UUID deviceCode;

    public Position toEntity() {
        return new Position(latitude, longitude, datetime, deviceCode);
    }
}
