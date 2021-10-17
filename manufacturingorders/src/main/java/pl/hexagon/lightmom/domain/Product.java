package pl.hexagon.lightmom.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PACKAGE)
@Setter(AccessLevel.PACKAGE)
public class Product extends Material{

    public Product(String id, String name, String defaultUnitOfMeasure) {
        super(id, name, defaultUnitOfMeasure);
    }
}