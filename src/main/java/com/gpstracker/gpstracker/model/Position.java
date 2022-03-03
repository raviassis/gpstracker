package com.gpstracker.gpstracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Double latitude;
    @NotNull
    private Double longitude;
    @NotNull
    private LocalDateTime datetime;
    @NotNull
    private UUID deviceCode;
    @NotNull
    private LocalDateTime createdDate;

    public Position(Double latitude, Double longitude, LocalDateTime datetime, UUID deviceCode) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.datetime = datetime;
        this.deviceCode = deviceCode;
        this.createdDate = LocalDateTime.now();
    }
}
