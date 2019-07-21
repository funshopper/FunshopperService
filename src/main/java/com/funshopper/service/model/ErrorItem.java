package com.funshopper.service.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ErrorItem {
    private String code;
    private String message;
}
