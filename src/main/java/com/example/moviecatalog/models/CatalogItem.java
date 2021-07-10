package com.example.moviecatalog.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CatalogItem {
    private String name;
    private  String description;
    private  int rating;
}
