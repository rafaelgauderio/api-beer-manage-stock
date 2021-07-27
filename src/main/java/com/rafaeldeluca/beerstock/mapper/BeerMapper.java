package com.rafaeldeluca.beerstock.mapper;

import com.rafaeldeluca.beerstock.dto.BeerDTO;
import com.rafaeldeluca.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
