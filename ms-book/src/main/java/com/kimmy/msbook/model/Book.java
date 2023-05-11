package com.kimmy.msbook.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book{
    private int bookId;
    private String name;
    private String author;
}

