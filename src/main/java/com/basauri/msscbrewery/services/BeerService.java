package com.basauri.msscbrewery.services;

import com.basauri.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}