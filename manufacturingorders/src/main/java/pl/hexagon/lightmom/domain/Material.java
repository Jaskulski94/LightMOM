package pl.hexagon.lightmom.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter(AccessLevel.PACKAGE)
@Setter(AccessLevel.PACKAGE)
public class Material implements SerialNumbered{
    private String id;
    private String name;
    private String defaultUnitOfMeasure;
}
