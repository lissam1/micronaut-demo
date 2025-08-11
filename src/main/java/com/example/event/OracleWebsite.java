package com.example.event;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.util.StringUtils;
import io.micronaut.sourcegen.annotations.Builder;

@Builder
@Introspected
public record OracleWebsite(String url, String region) {

    @Override
    public String toString() {
        if(StringUtils.isEmpty(region)) {
            return url;
        }
        return url + "/" + region + "/";
    }
}
