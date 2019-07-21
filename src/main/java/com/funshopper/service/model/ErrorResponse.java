package com.funshopper.service.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ErrorResponse {

    List<ErrorItem> errorItems = new ArrayList<>();

    public void addError(ErrorItem errorItem) {
        errorItems.add(errorItem);
    }

}
