package com.tsp.backend.models;

import lombok.Setter;


public enum UserRoles {
    ADMIN, USER;

    private String code;

    private UserRoles(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
