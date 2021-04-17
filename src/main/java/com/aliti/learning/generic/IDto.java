package com.aliti.learning.generic;

import lombok.Data;

import java.io.Serializable;

@Data
public class IDto implements Serializable {

    private String id;
    private String name;
    private String description;

}
