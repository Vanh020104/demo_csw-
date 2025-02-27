package com.example.demo_csw.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEntity {
    private int code;
    private String msg;
    private List<Object> data;


}
