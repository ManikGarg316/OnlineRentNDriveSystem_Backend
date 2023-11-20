package com.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

import com.app.util.Fuel;
import com.app.util.Transmission;

@Data
@AllArgsConstructor
public class FilterParameters {
    private Transmission tranmissionType;
    private Fuel fuelType;
    private Integer numOfSeats;
    private Date toDate;
    private Date fromDate;
}