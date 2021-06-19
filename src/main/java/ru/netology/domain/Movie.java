package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor

public class Movie {
    private int id;
    private int productId;
    private String productName;
    private String genre;
    }