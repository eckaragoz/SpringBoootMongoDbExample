package com.mongodb.enyity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Getter
@Setter
@Document
public class Kullanici {

    @Id
    private String id;

    private String name;
    private String sirname;
    private HashMap features;

    public Kullanici(String id, String name, String sirname) {
        this.id = id;
        this.name = name;
        this.sirname = sirname;
    }
}
