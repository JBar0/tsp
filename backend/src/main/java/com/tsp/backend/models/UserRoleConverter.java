package com.tsp.backend.models;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class UserRoleConverter implements AttributeConverter<UserRoles, String> {
    @Override
    public String convertToDatabaseColumn(UserRoles userRoles) {
        return null;
    }

    @Override
    public UserRoles convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }

        return Stream.of(UserRoles.values())
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
