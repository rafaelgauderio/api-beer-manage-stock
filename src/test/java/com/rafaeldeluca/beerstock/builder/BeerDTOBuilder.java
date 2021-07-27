package com.rafaeldeluca.beerstock.builder;

import lombok.Builder;
import com.rafaeldeluca.beerstock.dto.BeerDTO;
import com.rafaeldeluca.beerstock.enums.BeerType;

@Builder
public class BeerDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Amstel";

    @Builder.Default
    private String brand = "Heineken";

    @Builder.Default
    private int max = 50;

    @Builder.Default
    private int quantity = 10;

    @Builder.Default
    private BeerType type = BeerType.LAGER;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(id,
                name,
                brand,
                max,
                quantity,
                type);
    }
}
