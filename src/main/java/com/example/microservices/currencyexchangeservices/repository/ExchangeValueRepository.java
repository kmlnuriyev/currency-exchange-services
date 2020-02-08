package com.example.microservices.currencyexchangeservices.repository;

import com.example.microservices.currencyexchangeservices.bean.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

    // we should not be implement this method
    ExchangeValue findByFromAndTo(String from, String to);
}
