package com.example.homework2;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Quote {


    private int id;
    @Size(max = 20, message = "Size should be max 200 chars")
    private String phrase;


}
