package com.home.eciconfigurator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TableRow {
    private String name;
    private String value;
    private String description;
}
