package com.example.validation;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.Context;
import jakarta.validation.constraints.PositiveOrZero;

@ConfigurationProperties("company")
@Context
public class CompanyConfiguration {

    @PositiveOrZero
    private Integer valueAddedTax;

    public Integer getValueAddedTax() {
        return valueAddedTax;
    }

    public void setValueAddedTax(Integer valueAddedTax) {
        this.valueAddedTax = valueAddedTax;
    }
}
