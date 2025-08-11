package com.example.event;

import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;

@Factory
class OracleWebsiteFactory {

    @Singleton
    OracleWebsiteBuilder oracleWebsiteBuilder(){
        return  OracleWebsiteBuilder.builder().url("https://www.oracle.com");
    }

    @Singleton
    OracleWebsite oracleWebsiteBuilder(OracleWebsiteBuilder oracleWebsiteBuilder){
        return oracleWebsiteBuilder.build();
    }
}
