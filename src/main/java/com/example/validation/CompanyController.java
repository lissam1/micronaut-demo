package com.example.validation;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Map;

@Controller("company")
public class CompanyController {
    private final CompanyConfiguration companyConfiguration;

    public CompanyController(CompanyConfiguration companyConfiguration) {
        this.companyConfiguration = companyConfiguration;
    }

    @Get
    Map<String, Integer> index() {
        return Map.of("val", companyConfiguration.getValueAddedTax());
    }
}
